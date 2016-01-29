package com.test.sql;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

public class ExampleDemo {
	public static void main(String[] args) throws Exception{
		Connection connection=DBUtil.getDBConnection();
		connection.setAutoCommit(false);
		DatabaseMetaData dmd=connection.getMetaData();
		if(dmd.supportsBatchUpdates()){
			System.out.println("support batch updates");
		}
		try{
		Statement st=connection.createStatement();
		st.executeUpdate("create table survey (id int,name varchar(10));");
	    st.executeUpdate("insert into survey (id,name ) values (2,'teja');");

	    ResultSet rs = null;
	    DatabaseMetaData meta = connection.getMetaData();
	    rs=meta.getTableTypes();

	    while (rs.next()) {
	      String tableType = rs.getString(1);
	      System.out.println("tableType=" + tableType);
	    }
	    connection.commit();
	    connection.close();
		}
		catch(Exception e){
			e.printStackTrace();
			connection.rollback();
		}
	}
}
