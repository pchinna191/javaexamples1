package com.test.jdbc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;
@Component
public class StudentRowMapper implements RowMapper<StudentDTO>{
	public StudentDTO mapRow(ResultSet rs, int rowNum) throws SQLException {
		StudentDTO dto  = new StudentDTO();
		dto.setSno(rs.getInt("Sno"));
		dto.setSname(rs.getString("Sname"));
		dto.setCourse(rs.getString("Course"));
		dto.setFee(rs.getInt("Fee"));
		return dto;
	}
}
