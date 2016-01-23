package exceptions;

public class ExceptionDemo2 {
	public static void main(String[] args) {
		try{
			//Step1
			String names[]={"Jhon","Rama","Siva"}; //Excepting from Back End
			System.out.println("Names [4] " + names[5]);
		}catch(ArrayIndexOutOfBoundsException aexp){
			aexp.printStackTrace();
			
			System.out.println(aexp.getMessage());
		}
		
		try{
			//Step2
			Student studentObj =new Student(101, "Jhon", 2300); //NA
			System.out.println("Sno " + studentObj.getEno());
		}catch(NullPointerException nexp){
			nexp.printStackTrace();
			System.out.println(" Exp handling Logic ...");
		}
		
		try{
			//Step3
			int result = 10/5;
			System.out.println(" Result " + result);
		}catch(ArithmeticException aexp){
			aexp.printStackTrace();
			System.out.println(" AExp B.L");
		}
		
		

	}
}
