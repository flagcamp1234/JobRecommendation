package db;

import java.sql.SQLException;
import java.util.List;
import java.util.Set;

import entity.Job;
import entity.User;

public interface DBConnection extends AutoCloseable {
	 
	/* Close the connection.
	 */
	public void close();

	/**
	 * register a user
	 * @param username
	 * @param password
	 * @param emailAddress
	 * @return
	 */
	public boolean creatUserProfile(String username, String password, String emailAddress);
	
	/**
	 * update user profile
	 * @param username
	 * @param password
	 * @param emailAddress
	 * @return
	 */
	public boolean updateUserProifle(String username, String password, String emailAddress);
	
	/**
	 * 
	 * @param username
	 * @return
	 */
	public User getUserProfile(String username);
	
	/**
	 * 
	 * @param username
	 * @param jobId
	 * @return
	 */
	public boolean setAppliedItem(String username, String jobId);
	
	/**
	 * 
	 * @param username
	 * @param jobId
	 * @return
	 */
	public Job getAppliedItem(String username, String jobId);
	
	/**
	 * 
	 * @param username
	 * @return
	 */
	public List<Job> getAppliedItems(String username);
	
	/**
	 * 
	 * @param username
	 * @param jobId
	 * @return
	 */
	public Job getFavoriedItem(String username, String jobId);
	
	/**
	 * 
	 * @param username
	 * @param jobId
	 * @return
	 */
	public Job setFavoriedItem(String username, String jobId);
	
	/**
	 * 
	 * @param username
	 * @return
	 */
	public List<Job> getFavoriedItems(String username);

	/**
	 * 
	 * @param username
	 * @param jobIds
	 * @return
	 */
	public boolean unsetFavoriteItems(String username, List<String> jobIds);
	
}

