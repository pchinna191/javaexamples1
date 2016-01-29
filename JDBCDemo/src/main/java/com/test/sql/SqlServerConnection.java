package com.test.sql;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class SqlServerConnection {
	public static void main(String[] args) throws Exception{
		/*Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");	
		String dbURL = "jdbc:sqlserver://localhost:1433;databaseName=bi_db;integratedSecurity=true;";
		Connection conn = DriverManager.getConnection(dbURL);
		
		System.out.println(conn);
		if (conn != null) {
		    System.out.println("Connected");
		}*/
		Connection connection=SqlDbUtil.getDBConnection();
		System.out.println(connection);
		  Statement s1 = connection.createStatement();
          ResultSet rs = s1.executeQuery("SELECT * FROM employee_data");
       
          if(rs!=null){
              while (rs.next()){
                  
                           }
          }
		connection.close();
	
	}
	
	
}
