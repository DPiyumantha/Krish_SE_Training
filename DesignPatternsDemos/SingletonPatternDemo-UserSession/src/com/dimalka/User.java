package com.dimalka;

public class User {
	
	private String userName, email;

	public User(String userName, String email) {
		super();
		this.userName = userName;
		this.email = email;
	}

	public String getUserName() {
		return userName;
	}

	public String getEmail() {
		return email;
	}

	
	public String displayUser() {
		return "User [userName=" + userName + ", email=" + email + "]";
	}
	

}
