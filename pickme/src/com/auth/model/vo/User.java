package com.auth.model.vo;

import java.io.Serializable;

public class User implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String userId;
	private String userPass;
	private String userEmail;
	private String userName;
	
	public User() {
		super();
	}

	public User(String userId, String userPass, String userEmail, String userName) {
		super();
		this.userId = userId;
		this.userPass = userPass;
		this.userEmail = userEmail;
		this.userName = userName;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserPass() {
		return userPass;
	}

	public void setUserPass(String userPass) {
		this.userPass = userPass;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", userPass=" + userPass + ", userEmail=" + userEmail + ", userName="
				+ userName + "]";
	}
}
