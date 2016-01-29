package com.test.sql;

import java.sql.Connection;

public class MysqlConnection {

	public static void main(String[] args) throws Exception  {
		/*//Load Driver Class Name
		Class.forName("com.mysql.jdbc.Driver");
		
		//Connection
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jan_db?autoReconnect=true&useSSL=false", "root", "root");
		
		//PErform DB
		System.out.println(connection);
		
		
		//Close DB
		*/
		
			Connection connection=DBUtil.getDBConnection();
			System.out.println(connection);
			connection.close();
		
		
	}
}
