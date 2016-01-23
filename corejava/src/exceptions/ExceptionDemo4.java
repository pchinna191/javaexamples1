package exceptions;

import java.io.FileInputStream;
import java.io.IOException;

public class ExceptionDemo4 {
	public static void main(String[] args) throws Exception {
		System.out.println(" Start ###############");
		//try{
			//Step0
			FileInputStream fileInputStream= new FileInputStream("Student.java");
			fileInputStream.read();
			
			//Step1
			Class.forName("test");
		
	  //}
		/*catch(IOException | ClassNotFoundException exp){
			exp.printStackTrace();
			System.out.println(" Back up Logic .... AExp");
		}*/
	
		
		System.out.println(" End ###############");
	}
}
