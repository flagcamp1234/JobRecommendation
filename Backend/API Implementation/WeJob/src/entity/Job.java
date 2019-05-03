package entity;


/**
 * Job Bean class
 *
 */
public class Job {
	private int id;
	private String apiJobId;
	private int userId;
	private String jobTitle;
	private String company;
	private String location;
	private String jobSnippet;
	private String jobDetail;
	
	private Job(JobBuilder builder) {
		this.id = builder.id;
		this.apiJobId = builder.apiJobId;
		this.userId = builder.userId;
		this.jobTitle = builder.jobTitle;
		this.company = builder.company;
		this.location = builder.location;
		this.jobSnippet = builder.jobSnippet;
		this.jobDetail = builder.jobDetail;
	}
	
	public int getId() {
		return id;
	}

	public String getApiJobId() {
		return apiJobId;
	}

	public int getUserId() {
		return userId;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public String getCompany() {
		return company;
	}
	
	public String getLocation() {
		return location;
	}

	public String getJobSnippet() {
		return jobSnippet;
	}
	
	public String getJobDetail() {
		return jobDetail;
	}

	public static class JobBuilder {
		private int id;
		private String apiJobId;
		private int userId;
		private String jobTitle;
		private String company;
		private String location;
		private String jobSnippet;
		private String jobDetail;
		
		public JobBuilder setId(int id) {
			this.id = id;
			return this;
		}
		public JobBuilder setApiJobId(String apiJobId) {
			this.apiJobId = apiJobId;
			return this;
		}
		public JobBuilder setUserId(int userId) {
			this.userId = userId;
			return this;
		}
		public JobBuilder setJobTitle(String jobTitle) {
			this.jobTitle = jobTitle;
			return this;
		}
		public JobBuilder setCompany(String company) {
			this.company = company;
			return this;
		}
		public JobBuilder setLocation(String location) {
			this.location = location;
			return this;
		}
		public JobBuilder setJobSnippet(String jobSnippet) {
			this.jobSnippet = jobSnippet;
			return this;
		}	
		
		public JobBuilder setJobDetail(String jobDetail) {
			this.jobDetail = jobDetail;
			return this;
		}
		public Job build() {
			return new Job(this);
		}
	}
}
