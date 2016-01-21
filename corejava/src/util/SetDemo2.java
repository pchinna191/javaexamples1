package util;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
public class SetDemo2 {
	public static void main(String[] args) {
		Set<Student> stuSet = new HashSet<Student>();
		stuSet.add(new Student(567, "Jhon", 323));
		stuSet.add(new Student(45, "Ave", 6452));
		stuSet.add(new Student(57, "Tim", 4552));
		stuSet.add(new Student(167, "Tao", 1234));
		stuSet.add(new Student(7, "Ken", 456));

		
		stuSet.add(new Student(567, "Jhon", 323));
		stuSet.add(new Student(45, "Ave", 6452));
		stuSet.add(new Student(57, "Tim", 4552));
		stuSet.add(new Student(167, "Tao", 1234));
		stuSet.add(new Student(7, "Ken", 456));
		
		System.out.println("Size  " + stuSet.size());
		for(Student stu:stuSet){
			if(stu.getEname().equals("Jhon"))
				System.out.println( stu);
			}
			
			
			
		
		//System.out.println( stuSet);
	}
}
