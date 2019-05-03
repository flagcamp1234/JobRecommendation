package entity;

/**
 * User Bean Class
 * 
 *
 */
public class User {
	private int id;
	private String userName;
	private String emailAddress;
	private String password;
	
	private User(UserBuilder builder) {
		this.id = builder.id;
		this.userName = builder.userName;
		this.emailAddress = builder.emailAddress;
		this.password = builder.password;		
	}
	
	
	public int getId() {
		return id;
	}


	public String getUserName() {
		return userName;
	}


	public String getEmailAddress() {
		return emailAddress;
	}


	public String getPassword() {
		return password;
	}


	public static class UserBuilder {
		private int id;
		private String userName;
		private String emailAddress;
		private String password;
		public void setId(int id) {
			this.id = id;
		}
		public UserBuilder setUserName(String userName) {
			this.userName = userName;
			return this;
		}
		public UserBuilder setEmailAddress(String emailAddress) {
			this.emailAddress = emailAddress;
			return this;
		}
		public UserBuilder setPassword(String password) {
			this.password = password;
			return this;
		}
		
		public User build() {
			return new User(this);
		}
	}
}
