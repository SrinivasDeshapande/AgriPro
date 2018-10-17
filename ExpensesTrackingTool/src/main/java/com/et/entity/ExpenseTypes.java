package com.et.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Expense_Types")
public class ExpenseTypes {
	
	
	
	@Override
	public String toString() {
		return "ExpenseTypes [typeId=" + typeId + ", name=" + name + ", creator_id=" + creator_id + ", updator_id="
				+ updator_id + ", createdOn=" + createdOn + "]";
	}
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	@Column(name="type_id")
	private long typeId;
	@Column(name="name")
	private String name;
//	@Column(name="Description")
//	private String description    ; 
	@Column(name="creator_id",insertable=true,updatable=false)
	private long creator_id     ;
	@Column(name="updator_id",insertable=false,updatable=true)
	private long updator_id      ;
	@Column(name="createdOn" ,insertable=true,updatable=false)
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
	public long getTypeId() {
		return typeId;
	}
	public void setTypeId(long typeId) {
		this.typeId = typeId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
