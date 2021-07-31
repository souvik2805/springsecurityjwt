package com.asl.springsecurityjwt.entity;

import java.io.Serializable;

public class AuthRequestDTO implements Serializable {

	private String userName;
	private String password;

	public AuthRequestDTO(String userName, String password) {
		this.userName = userName;
		this.password = password;
	}

	public AuthRequestDTO() {
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
