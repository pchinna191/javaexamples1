package util;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ListDemo1 {
	public static void main(String[] args) {
		List<String> strList = new ArrayList<String>();
		strList.add("Apple");
		strList.add("Jhon");
		strList.add("Tim");
		strList.add("Apple");
		strList.add("Jhon");
		strList.add("Tim");
		strList.add("Ken");
		
		strList.add(1, "Welcome");
		
		//Read - ByIndex
		for(int i=0;i<strList.size();i++){
			System.out.println(strList.get(i));
			if(strList.get(i).equals("Jhon")){
				strList.add("Dummy");
			}
		}
		System.out.println("==============");
		
		for(String str : strList){ //ReadOnly
			System.out.println(str.toUpperCase());
			
			/*if(str.equals("Jhon")){
				strList.add("Dummy");
			}*/
		}
		
		Iterator<String> iteratorRef =  strList.iterator();
		System.out.println("Before List Size "  + strList.size());
		while(iteratorRef.hasNext()){
			String str = iteratorRef.next();
			System.out.println(str);
			if(str.equals("Jhon")){
				iteratorRef.remove();
			}
		}
		System.out.println("After List Size "  + strList.size());
		
		System.out.println("========================");
		ListIterator<String> listIteratorRef = strList.listIterator();
		while(listIteratorRef.hasNext()){
			String str = listIteratorRef.next();
			System.out.println(str);
			if(str.equals("Dummy")){
				listIteratorRef.remove();
			}
			
			if(str.equals("Tim")){
				listIteratorRef.add("NewData");
			}
			
		}
		System.out.println("===============");
		while(listIteratorRef.hasPrevious()){
			String str = listIteratorRef.previous();
			System.out.println(str);
		}
		

	}

}
