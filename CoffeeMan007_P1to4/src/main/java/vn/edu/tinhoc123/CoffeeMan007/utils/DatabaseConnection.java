package vn.edu.tinhoc123.CoffeeMan007.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
	
	static public Connection getConnection(String dbName, String userMySQL, String passMySQL) {
		 
		String strConn = "jdbc:mysql://localhost:3306/"+dbName;
		 
		Connection conn;
		try {
			conn = DriverManager.getConnection(strConn, userMySQL, passMySQL);
			return conn;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;		 
	}

}
