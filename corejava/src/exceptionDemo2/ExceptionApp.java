package exceptionDemo2;

public class ExceptionApp {
	public static void main(String[] args) {
		ServiceLayer s = new ServiceLayer();
		Paramters paramters = new Paramters("101", "Rama");
		try{
			s.getEmployeeNumber(paramters);
		}catch(DataException de){
			de.printStackTrace();
			System.exit(99);
		}catch(ServiceException se){
			se.printStackTrace();
		}finally{
			System.out.println(" Always Execute !!!!");
		}
		
	}
}
