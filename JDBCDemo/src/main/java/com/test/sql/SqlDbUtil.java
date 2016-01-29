package com.test.sql;

import java.io.IOException;
import java.sql.Connection;
import java.util.Properties;

import org.apache.commons.dbcp.BasicDataSource;

public class SqlDbUtil {
	private static Properties dbProperties=new Properties();
	private static BasicDataSource datasource  = new BasicDataSource();

	static{
		try{
			dbProperties.load(DBUtil.class.getResourceAsStream("database1.properties"));
			datasource.setUrl(dbProperties.getProperty("db.url"));
			/*datasource.setUsername(dbProperties.getProperty("db.username"));
			datasource.setPassword(dbProperties.getProperty("db.password"));*/
			datasource.setDriverClassName(dbProperties.getProperty("db.driverclassName"));
			datasource.setInitialSize(10);
			System.out.println(" DB Properties "+ dbProperties );
		}catch(IOException ex){
			ex.printStackTrace();
			System.out.println("Failed !! loading DB properties");
		}
	}
	public static Connection getDBConnection() throws Exception{
		return datasource.getConnection();
	}
}
