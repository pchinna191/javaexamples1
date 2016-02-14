package com.test.jpa.service;
import org.dozer.DozerBeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import com.test.dto.StudentDTO;
import com.test.jpa.dao.StudentDAO;
import com.test.jpa.dao.pojo.Student;

@Service
@Transactional
public class StudentService {
	@Autowired
	StudentDAO studentDAO;
	
	@Autowired
	DozerBeanMapper dozermapper;
	
	public StudentDTO getStudent(Integer sno){
		Student student = studentDAO.read(sno);  
		StudentDTO studentDTO = dozermapper.map(student, StudentDTO.class);
		return studentDTO;
	}
}
