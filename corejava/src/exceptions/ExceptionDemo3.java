package exceptions;

public class ExceptionDemo3 {
	public static void main(String[] args) {
		System.out.println(" Start ###############");
		try{
			//Step1
			String names[]={"Jhon","Rama","Siva"}; //Excepting from Back End
			System.out.println("Names [4] " + names[2]);
			
			//Step2
			Student studentObj =new Student(101, "Jhon", 2300); //NA
			System.out.println("Sno " + studentObj.getEno());
			
			//Step3
			int result = 10/0;
			System.out.println(" Result " + result);
		}catch(ArrayIndexOutOfBoundsException | NullPointerException nexp){
			nexp.printStackTrace();
			System.out.println(" Back up Logic .... AExp");
		}catch(Exception ex){
			ex.printStackTrace();
			System.out.println(" We are Sorry ! Unable to process ypour request. Pls Try again!!");
		}
		
		/*catch(ArrayIndexOutOfBoundsException aexp){
			aexp.printStackTrace();
			System.out.println(" Back up Logic .... AExp");
		}catch(NullPointerException nexp){
			nexp.printStackTrace();
			System.out.println(" Exp handling Logic ...");
		}catch(ArithmeticException aexp){
			aexp.printStackTrace();
			System.out.println(" AExp B.L");
		}*/
		
		System.out.println(" End ###############");
	}
}
