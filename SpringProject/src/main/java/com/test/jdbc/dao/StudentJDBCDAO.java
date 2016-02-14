package com.test.jdbc.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;


@Component
public class StudentJDBCDAO {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	StudentRowMapper studentRowMapper;
	
	public void save(StudentDTO studentDTO) {
			jdbcTemplate.update("INSERT INTO Student VALUES(?,?,?,?)", 
					studentDTO.getSno(),studentDTO.getSname() ,studentDTO.getFee(),studentDTO.getCourse());
	}
	
	public StudentDTO getStudent(int sno) {
		StudentDTO studentDTO = jdbcTemplate.queryForObject("Select * from Student where sno = ?",
				new Object[]{sno}, studentRowMapper);
		return studentDTO;
	}
	
	public List<StudentDTO> getAllStudents() {
		List<StudentDTO> stuList = jdbcTemplate.query("Select * from Student",studentRowMapper);
		return stuList;
	}
	
	public void update(StudentDTO studentDTO){
		jdbcTemplate.update("UPDATE Student SET sname=?,course=?,fee=?  WHERE sno=? ", 
				studentDTO.getSname() ,studentDTO.getCourse(),studentDTO.getFee(),studentDTO.getSno());
	}
	
	public void delete(int sno){
		jdbcTemplate.update("DELETE FROM Student WHERE sno = ? ", sno);
	}
}
