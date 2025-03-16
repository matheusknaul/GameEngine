package com.matheusknaul.GameEngine.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {
	private static final String URL = "jdbc:h2:./game_db";
	private static final String USER = "admin";
	private static final String PASSWORD = "root";
	
	public static Connection connect() throws SQLException{
		return DriverManager.getConnection(URL, USER, PASSWORD);
	}
	
	public static void createTables() {
		
	}
}
