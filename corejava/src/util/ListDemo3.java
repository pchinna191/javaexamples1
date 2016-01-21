package util;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class ListDemo3 {
	public static void main(String[] args){
		
		List<Student>stuList1=new ArrayList<Student>();
		stuList1.add(new Student(124,"jim",12345));
		stuList1.add(new Student(224,"joe",22345));
		stuList1.add(new Student(324,"jak",32345));
		stuList1.add(new Student(424,"jet",42345));
		stuList1.add(new Student(224,"joe",22345));
		System.out.println("Student List1:"+stuList1);
		
		/*Student s1 = new Student(167, "Tao", 1234);
		Student s2 = new Student(167, "Tao", 1234)*/;
		
	/*	if(s1.equals(s2)){ //s1 == s2
			System.out.println("Equal");
		}else{
			System.out.println("Not Equal");
		}
		
		if(stuList1.contains(new Student(224, "joe", 22345))){
			System.out.println("Element Found");
		}else{
			System.out.println("Not Found");
		}*/
	System.out.println("befor sort: "+stuList1);
		//Collections.sort(stuList1);
		//Collections.sort(stuList1,new FeeSort());
		Collections.sort(stuList1,new NameSort());
		System.out.println("After sort: "+stuList1);	
	}	
	}


