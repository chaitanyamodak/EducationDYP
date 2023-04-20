package com.dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class MyConnection {
	public Connection getConnection() {
		String driver="oracle.jdbc.OracleDriver";
		String url="jdbc:oracle:thin:@localhost:1521:XE";
		String uname="System";
		String pass="system";
		Connection con=null;
		try {
			//Load Driver
			Class.forName(driver);
			//Establish Connection
			con=DriverManager.getConnection(url,uname,pass);
			//System.out.println("Connected to database");
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return con;
	}

}
