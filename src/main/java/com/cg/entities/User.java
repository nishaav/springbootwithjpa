package com.cg.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class User 
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int UserId;
	private String UserName;
	private String UserContact;
	
	public int getUserId() {
		return UserId;
	}
	public void setUserId(int userId) {
		UserId = userId;
	}
	public String getUserName() {
		return UserName;
	}
	public void setUserName(String userName) {
		UserName = userName;
	}
	public String getUserContact() {
		return UserContact;
	}
	public void setUserContact(String userContact) {
		UserContact = userContact;
	}
	
	
	
}
