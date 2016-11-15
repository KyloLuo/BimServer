package com.modelmanage.po;

import com.modelmanage.enumtype.priorityType;

public class User {
	private String username;
	private String email;
	private priorityType priorityType;
	public User(String username, String email, priorityType priorityType){
		this.username = username;
		this.email = email;
		this.priorityType = priorityType;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public priorityType getPriorityType() {
		return priorityType;
	}
	public void setPriorityType(priorityType priorityType) {
		this.priorityType = priorityType;
	}

}
