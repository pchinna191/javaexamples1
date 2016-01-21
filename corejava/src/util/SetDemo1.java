package util;
import java.util.Set;
import java.util.HashSet;

public class SetDemo1 {
public static void main(String[] args){
	
	Set<Student> strSet=new HashSet<Student>();
	strSet.add(new Student(983,"teja",3000));
	strSet.add(new Student(983,"teja",3000));
	strSet.add(new Student(678,"pooja",3000));
	System.out.println(strSet);
}
}
