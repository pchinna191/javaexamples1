package exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CustomExceptionDemo1 {
	public static void main(String[] args) {
		try{
			validateNumber(344);
			executeDB();
			executeIO();
		}catch(FileNotFoundException ex){
			ex.printStackTrace();
		}catch(SQLException sqlEx){
			sqlEx.printStackTrace();
		}catch(ClassNotFoundException cEx){
			cEx.printStackTrace();
		}catch(IOException ioEx){
			ioEx.printStackTrace();
		}catch(Exception ex){
			ex.printStackTrace();
		}
	}
	
	public static void validateNumber(int number) throws Exception{
		//B.L <0 || > 500
		if(number < 0 || number > 500){
			//Exp
			Exception ex = new Exception("Invalid.Number Must be > 0 And < 500 ");
			throw ex;
		}
		System.out.println(" Number Valid !!!");
	}
	
	public static void executeIO() throws FileNotFoundException,IOException,ClassNotFoundException {
		//Step0
		FileInputStream fileInputStream= new FileInputStream("Ram.txt");
		fileInputStream.read();
		
		//Step1
		Class.forName("test");
	}
	
	public static void executeDB() throws SQLException {
		Connection connection = DriverManager.getConnection("test");
	}
	
}
