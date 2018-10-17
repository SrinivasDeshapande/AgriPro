package com.et.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="users")

public class Users {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	@Column(name="user_id")
	private long userId;
	@Column(name="username")
	private String username;
	@Column(name="password")
	private double password    ;
	@Column(name="user_role")
	private Date userRole    ;
	@Column(name="creator_id")
	private long creator_id     ;
	@Column(name="updator_id")
	private long updator_id      ;
	@Column(name="createdOn")
	private Date createdOn       ;
	//private long updatedOn       
/*	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
*/	
	public long getCreator_id() {
		return creator_id;
	}
	
	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public double getPassword() {
		return password;
	}

	public void setPassword(double password) {
		this.password = password;
	}

	public Date getUserRole() {
		return userRole;
	}

	public void setUserRole(Date userRole) {
		this.userRole = userRole;
	}

	public void setCreator_id(long creator_id) {
		this.creator_id = creator_id;
	}
	public long getUpdator_id() {
		return updator_id;
	}
	public void setUpdator_id(long updator_id) {
		this.updator_id = updator_id;
	}
	public Date getCreatedOn() {
		return createdOn;
	}
	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}

	

}
