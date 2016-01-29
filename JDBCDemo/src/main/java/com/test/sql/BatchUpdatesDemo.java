package com.test.sql;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.Statement;

public class BatchUpdatesDemo {
	public static void main(String[] args) throws Exception{
		Connection connection=DBUtil.getDBConnection();
		connection.setAutoCommit(false);
		DatabaseMetaData dmd=connection.getMetaData();
		if(dmd.supportsBatchUpdates()){
			System.out.println("support batch updates");
		}
		try{
		Statement stmt=connection.createStatement();
		stmt.addBatch("insert into student values(127,'fed','ms',3000);");
		stmt.addBatch("insert into student values(125,'fin','cs',3000);");
		stmt.addBatch("insert into student values(126,'ferry','bs',3000);");
		int[] r=stmt.executeBatch();
		connection.commit();
		for(int i:r)
		System.out.println(i);
		}
		catch(Exception e){
			e.printStackTrace();
			connection.rollback();
		}
	}
}
