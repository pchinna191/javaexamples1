package com.test.sql;

import java.sql.Connection;
import java.sql.PreparedStatement;


public class TransactionDemo {
public static void main(String[] args) throws Exception{
	Connection connection=DBUtil.getDBConnection();
	connection.setAutoCommit(false);
	try{
	PreparedStatement stmt=connection.prepareStatement("insert into student values(?,?,?,?);");
	stmt.setInt(1,130);
	stmt.setString(2, "gorg");
	stmt.setString(3,"ms");
	stmt.setInt(4, 2090);
	int res1=stmt.executeUpdate();
	
	stmt.setInt(1,131);
	stmt.setString(2, "gerg");
	stmt.setString(3,"md");
	stmt.setInt(4, 400);
	int res2=stmt.executeUpdate();
	connection.commit();
	}
	catch(Exception e){
		e.printStackTrace();
		connection.rollback();
	}
}
}
