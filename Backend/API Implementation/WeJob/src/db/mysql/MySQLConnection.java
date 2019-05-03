package db.mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import db.DBConnection;
import entity.Job;

public class MySQLConnection implements DBConnection {
	   private Connection conn;
	   
	   public MySQLConnection() {
	  	 try {
	  		Class.forName("com.mysql.cj.jdbc.Driver").getConstructor().newInstance();
	  		 conn = DriverManager.getConnection(MySQLDBUtil.URL);
	  		
	  	 } catch (Exception e) {
	  		 e.printStackTrace();
	  	 }
	   }

	@Override
	public void close() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean creatUserProfile(String username, String password, String emailAddress) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateUserProifle(String username, String password, String emailAddress) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public entity.User getUserProfile(String username) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean setAppliedItem(String username, String jobId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Job getAppliedItem(String username, String jobId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Job> getAppliedItems(String username) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Job getFavoriedItem(String username, String jobId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Job setFavoriedItem(String username, String jobId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Job> getFavoriedItems(String username) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean unsetFavoriteItems(String username, List<String> jobIds) {
		// TODO Auto-generated method stub
		return false;
	}

	


}
