package com.utility;

import java.sql.Connection;

public class DBUtil {

	public static Connection provideConnection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		
String url = "jdbc:mysql://localhost:3306/sb101db";
		
        Connection conn = null;
        
		try {
			 conn = DriverManager.getConnection(url, "root", "9736043994@Ri");
			
			if(conn != null)
				System.out.println("connected...");
			else
				System.out.println("not connected..");
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conn;
	}
}
