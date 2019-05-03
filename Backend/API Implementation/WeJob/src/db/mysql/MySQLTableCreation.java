package db.mysql;

import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.Connection;

public class MySQLTableCreation {
	// Run this as Java application to reset db schema.
	public static void main(String[] args) {
		try {
			// Step 1 Connect to MySQL.
			System.out.println("Connecting to " + MySQLDBUtil.URL);
			Class.forName("com.mysql.cj.jdbc.Driver").getConstructor().newInstance();
			Connection conn = DriverManager.getConnection(MySQLDBUtil.URL);
			
			if (conn == null) {
				return;
			}
			Statement statement = conn.createStatement();
			String sql = "";
		// Step 1 Drop database and create a new one.
			
			  sql = "DROP DATABASE IF EXISTS " + MySQLDBUtil.DB_NAME; 
			  statement.executeUpdate(sql); 
			  sql = "CREATE DATABASE " + MySQLDBUtil.DB_NAME +" CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci;";
			  statement.executeUpdate(sql);
			 	    	
		// Step 2 Drop tables in case they exist.									
			sql = "DROP TABLE IF EXISTS users";
			statement.executeUpdate(sql);
			
			sql = "DROP TABLE IF EXISTS job_applied";
			statement.executeUpdate(sql);
			
			sql = "DROP TABLE IF EXISTS job_liked";
			statement.executeUpdate(sql);

			// Step 3 Create new tables
			sql = "CREATE TABLE users ("
					+ "user_id int NOT NULL AUTO_INCREMENT,"
					+ "username VARCHAR(255) NOT NULL,"
					+ "password VARCHAR(255) NOT NULL,"
					+ "email VARCHAR(255) NOT NULL,"
					+ "PRIMARY KEY (user_id)"
					+ "UNIQUE (username)"
					+ "UNIQUE (email)"
					+ ")";
			statement.executeUpdate(sql);			

			sql = "CREATE TABLE job_applied ("
					+ "job_applied_id int NOT NULL AUTO_INCREMENT,"
					+ "api_job_id VARCHAR(8000) NOT NULL,"
					+ "user_id int NOT NULL,"
					+ "job_title VARCHAR(255) NOT NULL,"
					+ "company_name VARCHAR(255) NOT NULL,"
					+ "location VARCHAR(255) NOT NULL,"
					+ "PRIMARY KEY (job_applied_id),"
					+ "FOREIGN KEY (user_id) REFERENCES users(user_id),"
					+ "UNIQUE(api_job_id)"
					+ ")";
			statement.executeUpdate(sql);
			
			sql = "CREATE TABLE job_liked ("
					+ "job_liked_id int NOT NULL AUTO_INCREMENT,"
					+ "api_job_id VARCHAR(8000) NOT NULL,"
					+ "user_id int NOT NULL,"
					+ "job_title VARCHAR(255) NOT NULL,"
					+ "company_name VARCHAR(255) NOT NULL,"
					+ "location VARCHAR(255) NOT NULL,"
					+ "PRIMARY KEY (job_applied_id),"
					+ "FOREIGN KEY (user_id) REFERENCES users(user_id),"
					+ "UNIQUE (api_job_id)"
					+ ")";
			statement.executeUpdate(sql);
			
			// Step 4: insert fake user 1111/3229c1097c00d497a0fd282d586be050
						sql = "INSERT INTO users VALUES('1111', '3229c1097c00d497a0fd282d586be050', 'johnsmith@gmail.com'";
						statement.executeUpdate(sql);

			conn.close();
			
			System.out.println("Import done successfully");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

