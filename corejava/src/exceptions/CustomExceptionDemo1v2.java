package exceptions;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CustomExceptionDemo1v2 {
	public static void main(String[] args) {
		try{
			validateNumber(344);
			
			executeIO();
			executeDB();
		}catch(CustomException ex){
			ex.printStackTrace();
			System.out.println("Code  " + ex.getErrorCode());
			System.out.println("Msg  " + ex.getErrorMsg());
		}
	}
	
	public static void validateNumber(int number) throws CustomException{
		//B.L <0 || > 500
		if(number < 0 || number > 500){
			//Exp
			buildCustomException("EX100","Invalid.Number Must be > 0 And < 500 ");
		}
		System.out.println(" Number Valid !!!");
	}
	
	public static void executeIO() throws CustomException {
		FileInputStream fileInputStream=null;
		try{
			//Step0
			 fileInputStream= new FileInputStream("Ram.txt");
			fileInputStream.read();
			
			//Step1
			Class.forName("test");
		}catch(FileNotFoundException ex){
			ex.printStackTrace();
			buildCustomException("FILE1000","File Not found");
		}catch(ClassNotFoundException cEx){
			cEx.printStackTrace();
			buildCustomException("CL1000","Class Not found");
		}catch(IOException ioEx){
			ioEx.printStackTrace();
			buildCustomException("IOError","IO Error !!!");
		}
		
	}
	
	
	public static void executeDB() throws CustomException {
		try{
			Connection connection = DriverManager.getConnection("test");
		}catch(SQLException sqlEx){
			buildCustomException("SQLERROR",sqlEx.getMessage());
		}
	}

	private static void buildCustomException(String code,String msg) throws CustomException {
		CustomException cExObj = new CustomException(code,msg);
		throw cExObj;
	}
	
}
