package edu.learning.config;

public class DBConnectionConfig {
	private String url;
	private String username;
	private String password;

	public DBConnectionConfig(String url, String username, String password) {
		this.url = url;
		this.username = username;
		this.password = password;
	}
	
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
