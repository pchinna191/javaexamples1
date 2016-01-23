package exceptionDemo2;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
public class DataLayer {
	public int getEmployeeNumber(Paramters parameters) throws DataException{
		if(parameters.getName() != null && parameters.getName().equals("")){
			buildCustomException("100", "Invalid Name");
		}
		
		try{
			FileInputStream fin = new FileInputStream("rama");
			fin.read();
		}catch(FileNotFoundException fe){
			buildCustomException("101", "File Not Found");
			return 0;
		}catch(IOException io){
			buildCustomException("102", "I/O Error");
		}finally{
			System.out.println("Data  Layer Finally Exp");
		}
		return 0;
	}

	private void buildCustomException(String errCode,String errMsg) throws DataException {
		DataException cex = new DataException(errCode,errMsg); //);
		throw cex;
	}
}
