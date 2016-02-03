package com.test.jpa;

import java.math.BigDecimal;
import java.util.List;

import com.test.dao.StudentDAO;
import com.test.pojo.Student;


public class JpaDaoApp {
	public static void main(String[] args) {
		StudentDAO studentDAO = new StudentDAO();
		
		//Insert
	 //studentDAO.save(new Student(6888, "BBBB", "MS", new BigDecimal(5000)));
		
		//Update
		//studentDAO.update(new Student(101, "jhon", "ms", new BigDecimal(2000)));
		
		//Delete : Not Working
		//studentDAO.delete(131);
		
		//Find / Read
		/*Student student = studentDAO.findBySno(112);
		System.out.println(" ############# " + student);
		*/
		
		List<Student> stuList =studentDAO.getAllStudentsByName("f%"); //studentDAO.getAllStudentsByFee(new BigDecimal(3000)); ////
		for(Student stu : stuList){
			System.out.println(" ############# " + stu);
		}
		System.out.println(" student  ########### "+studentDAO.getAllStudents());

	}

}
