package com.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MakeConnection {

	Connection cn;

	public Connection mkConnection() {

		try {
			// load Driver class
			Class.forName("com.mysql.cj.jdbc.Driver");
			// make connection
			cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hibernateall", "root", "");
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return cn;
	}
}
