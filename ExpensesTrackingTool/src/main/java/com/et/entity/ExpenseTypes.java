package com.et.entity;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.DynamicUpdate;

@Entity
@Table(name="Expense_Types")
@DynamicUpdate
public class ExpenseTypes implements Serializable{
	
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -5274013483007289200L;
	@Override
	public String toString() {
		return "ExpenseTypes [typeId=" + typeId + ", name=" + name + ", creator_id=" + creator_id + ", updator_id="
				+ updator_id + ", createdOn=" + createdOn + "]";
	}
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	@Column(name="type_id")
	private Long typeId;
	
	@Column(name="name",unique=true)
	private String name;
	
//	@Column(name="Description")
//	private String description    ;
	
	@Column(name="creator_id",insertable=true,updatable=false)
	private Long creator_id     ;
	@Column(name="updator_id",insertable=false,updatable=true)
	private Long  updator_id      ;
	@Column(name="createdOn" ,insertable=true,updatable=false)
	@CreationTimestamp
	private LocalDateTime createdOn       ;
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
	public Long getTypeId() {
		return typeId;
	}
	public void setTypeId(Long typeId) {
		this.typeId = typeId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	public LocalDateTime getCreatedOn() {
		return createdOn;
	}
	public void setCreatedOn(LocalDateTime createdOn) {
		this.createdOn = createdOn;
	}
	

	

}
