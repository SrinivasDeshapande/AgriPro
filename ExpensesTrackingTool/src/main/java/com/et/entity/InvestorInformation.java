package com.et.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Inverstor_Information")
public class InvestorInformation {
	
	
	
	@Override
	public String toString() {
		return "InvestorInformation [invId=" + invId + ", invName=" + invName + ", amount=" + amount + ", dateOfInv="
				+ dateOfInv + ", farmid=" + farmid + ", creator_id=" + creator_id + ", updator_id=" + updator_id
				+ ", createdOn=" + createdOn + "]";
	}
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	@Column(name="inv_id")
	private long invId;
	@Column(name="invName")
	private String invName;
	@Column(name="Amount")
	private double amount    ;
	@Column(name="DateOfInv")
	private Date dateOfInv    ;
	@Column(name="Farm_id" )
	private long farmid    ;
	@Column(name="creator_id" ,insertable=true,updatable=false)
	private long creator_id     ;
	@Column(name="updator_id" ,insertable=false,updatable=true)
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
	public long getInvId() {
		return invId;
	}
	public void setInvId(long invId) {
		this.invId = invId;
	}
	public String getInvName() {
		return invName;
	}
	public void setInvName(String invName) {
		this.invName = invName;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public Date getDateOfInv() {
		return dateOfInv;
	}
	public void setDateOfInv(Date dateOfInv) {
		this.dateOfInv = dateOfInv;
	}
	public long getFarmid() {
		return farmid;
	}
	public void setFarmid(long farmid) {
		this.farmid = farmid;
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
