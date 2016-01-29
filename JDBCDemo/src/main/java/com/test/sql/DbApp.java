package com.test.sql;

import java.util.List;

import com.test.dao.DBException;
import com.test.dao.StudentDao;
import com.test.dao.StudentDto;

public class DbApp {
public static void main(String[] args) throws DBException{
	StudentDao dao=new StudentDao();
	/*boolean r=dao.delete(104);
	if(r){
		System.out.println("deletedstudent record");
	}*/
	/*List<StudentDto>stulist=dao.getStudentrecords();
	System.out.println(stulist);*/
	
StudentDto student	=dao.getStudent(120);
System.out.println(student);
}
}
