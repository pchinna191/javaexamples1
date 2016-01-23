package exceptions;

public class ExceptionDemo5 {
	public static void main(String[] args) {
		try{
			validateNumber(345);
			validateNumber(-34);
			validateNumber(2345);
	}
	catch(Exception ex){
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
}
