package com.test.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.test.sql.DBUtil;

public class StudentDao {
	/*public boolean saveUsingStmt(StudentDto studentdto) throws DBException{
		 Connection connection=null;
		 try{
			connection= DBUtil.getDBConnection();
			Statement statement=connection.createStatement();
			String sqlstmt="Insert into student values("+studentdto.getSno()+" ,'"+
			studentdto.getSname()+" ','"+studentdto.getCourse()+"',"+studentdto.getFee()+");";
			int result=statement.executeUpdate(sqlstmt);
			System.out.println(sqlstmt);
			if (result==1){
				return true;
			}
			
		 }
		catch(Exception e)
		 {
			e.printStackTrace();
			DBException dbe=new DBException("dberror",e.getMessage());
			throw dbe;
		 }
		 return false;
	}*/
	
	public boolean saveUsingPrstmt(StudentDto studentdto) throws DBException{
		 Connection connection=null;
		 try{
			connection= DBUtil.getDBConnection();
			PreparedStatement prestatement=connection.prepareStatement("insert into student values(?,?,?,?)");
			prestatement.setInt(1, studentdto.getSno());
			prestatement.setString(2, studentdto.getSname());
			prestatement.setString(3, studentdto.getCourse());
			prestatement.setDouble(4, studentdto.getFee());
			int result=prestatement.executeUpdate();
			System.out.println(prestatement);
			if (result==1){
				return true;
			}
			
		 }
		catch(Exception e)
		 {
			e.printStackTrace();
			DBException dbe=new DBException("dberror",e.getMessage());
			throw dbe;
		 }
		 return false;
	}
	public boolean update(StudentDto studentDTO) throws DBException{
		Connection connection = null;
		try{
			connection = DBUtil.getDBConnection();
			PreparedStatement pstmt = connection.prepareStatement("UPDATE Student SET name=?,couse=?,fee=?  WHERE id=? ;");
			pstmt.setString(1, studentDTO.getSname() );
			pstmt.setDouble(3, studentDTO.getFee());
			pstmt.setString(2, studentDTO.getCourse() );
			pstmt.setInt(4, studentDTO.getSno());
			int result = pstmt.executeUpdate();
			if( result == 1)
				return true;
		}catch(Exception ex){
			ex.printStackTrace();
			DBException dbException  = new DBException("DBErr", ex.getMessage());
			throw dbException;
		}
		finally{
			try{
				connection.close();
			}
			catch(SQLException ex){
				ex.printStackTrace();
				DBException dbException  = new DBException("DBErr", ex.getMessage());
				throw dbException;
			}
		}
		return false;
	}
	public boolean delete(int sno) throws DBException{
		Connection connection = null;
		try{
			connection = DBUtil.getDBConnection();
			PreparedStatement pstmt = connection.prepareStatement("delete from student where id=?;");
			/*pstmt.setString(1, studentDTO.getSname() );
			pstmt.setDouble(3, studentDTO.getFee());
			pstmt.setString(2, studentDTO.getCourse() );*/
			pstmt.setInt(1,sno);
			int result = pstmt.executeUpdate();
			if( result == 1)
				return true;
		}catch(Exception ex){
			ex.printStackTrace();
			DBException dbException  = new DBException("DBErr", ex.getMessage());
			throw dbException;
		}
		finally{
			try{
				connection.close();
			}
			catch(SQLException ex){
				ex.printStackTrace();
				DBException dbException  = new DBException("DBErr", ex.getMessage());
				throw dbException;
			}
		}
		return false;
	}
	public List<StudentDto> getStudentrecords() throws DBException{
		Connection connection = null;
		List<StudentDto> stu=new ArrayList<StudentDto>();
		try{
			connection = DBUtil.getDBConnection();
			PreparedStatement pstmt = connection.prepareStatement("select * from student");
			/*pstmt.setString(1, studentDTO.getSname() );
			pstmt.setDouble(3, studentDTO.getFee());
			pstmt.setString(2, studentDTO.getCourse() );
			pstmt.setInt(1,sno);*/
			ResultSet rset=pstmt.executeQuery();
			while(rset.next()){
				StudentDto dto=new StudentDto();
				dto.setSno(rset.getInt("id"));
				dto.setSname(rset.getString("name"));
				dto.setFee(rset.getInt("fee"));
				dto.setCourse(rset.getString("couse"));
				
				stu.add(dto);
				}
			
		}catch(Exception ex){
			ex.printStackTrace();
			DBException dbException  = new DBException("DBErr", ex.getMessage());
			throw dbException;
		}
		finally{
			try{
				connection.close();
			}
			catch(SQLException ex){
				ex.printStackTrace();
				DBException dbException  = new DBException("DBErr", ex.getMessage());
				throw dbException;
			}
		}
		return stu;
	}
	public StudentDto getStudent(int sno) throws DBException{
		Connection connection = null;
		try{
			connection = DBUtil.getDBConnection();
			PreparedStatement pstmt = connection.prepareStatement("Select * from Student where id = ?");
			pstmt.setInt(1, sno);
			ResultSet rs = pstmt.executeQuery();
			if(rs.next()){
				StudentDto dto  = new StudentDto();
				dto.setSno(rs.getInt("id"));
				dto.setSname(rs.getString("name"));
				dto.setCourse(rs.getString("Couse"));
				dto.setFee(rs.getInt("fee"));
				return dto;
			}
		}catch(Exception ex){
			ex.printStackTrace();
			DBException dbException  = new DBException("DBErr", ex.getMessage());
			throw dbException;
		}finally{
			try{
				connection.close();
			}catch(SQLException ex){
				ex.printStackTrace();
				DBException dbException  = new DBException("DBErr", ex.getMessage());
				throw dbException;
			}
		}
		return null; //Not Found
	}

 

}
