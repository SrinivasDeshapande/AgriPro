package com.et.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicUpdate;

@Entity
@Table(name="users")
@DynamicUpdate
public class Users {
	
	
	@Override
	public String toString() {
		return "Users [userId=" + userId + ", username=" + username + ", password=" + password + ", userRole="
				+ userRole + ", creator_id=" + creator_id + ", updator_id=" + updator_id + ", createdOn=" + createdOn
				+ "]";
	}
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	@Column(name="user_id")
	private Long userId;
	@Column(name="username",nullable=false)
	private String username;
	@Column(name="password")
	private String password    ;
	@Column(name="user_role")
	private Date userRole    ;
	@Column(name="creator_id",insertable=true,updatable=false)
	private Long creator_id     ;
	@Column(name="updator_id",insertable=false,updatable=true)
	private Long  updator_id      ;
	@Column(name="createdOn",insertable=true,updatable=false)
	private Date createdOn       ;
	//private Long updatedOn       
/*	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
*/	
	public Long getCreator_id() {
		return creator_id;
	}
	
	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
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

	public Date getUserRole() {
		return userRole;
	}

	public void setUserRole(Date userRole) {
		this.userRole = userRole;
	}

	public void setCreator_id(Long creator_id) {
		this.creator_id = creator_id;
	}
	public Long getUpdator_id() {
		return updator_id;
	}
	public void setUpdator_id(Long updator_id) {
		this.updator_id = updator_id;
	}
	public Date getCreatedOn() {
		return createdOn;
	}
	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}

	

}
