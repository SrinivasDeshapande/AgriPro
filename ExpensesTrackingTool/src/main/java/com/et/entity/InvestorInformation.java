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

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.DynamicUpdate;

@Entity
@Table(name="Inverstor_Information")
@DynamicUpdate
public class InvestorInformation implements Serializable {
	
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -1702680648631810463L;
	
	@Override
	public String toString() {
		return "InvestorInformation [invId=" + invId + ", invName=" + invName + ", amount=" + amount + ", dateOfInv="
				+ dateOfInv + ", farmid=" + farmid + ", creator_id=" + creator_id + ", updator_id=" + updator_id
				+ ", createdOn=" + createdOn + "]";
	}
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	@Column(name="inv_id")
	private Long invId;
	@Column(name="invName")
	private String invName;
	@Column(name="Amount")
	private Double amount    ;
	@Column(name="DateOfInv")
	private Date dateOfInv    ;
	@Column(name="Farm_id" )
	private Long farmid    ;
	@Column(name="creator_id" ,insertable=true,updatable=false)
	private Long creator_id     ;
	@Column(name="updator_id" ,insertable=false,updatable=true)
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
	public Long getInvId() {
		return invId;
	}
	public void setInvId(Long invId) {
		this.invId = invId;
	}
	public String getInvName() {
		return invName;
	}
	public void setInvName(String invName) {
		this.invName = invName;
	}
	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	public Date getDateOfInv() {
		return dateOfInv;
	}
	public void setDateOfInv(Date dateOfInv) {
		this.dateOfInv = dateOfInv;
	}
	public Long getFarmid() {
		return farmid;
	}
	public void setFarmid(Long farmid) {
		this.farmid = farmid;
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
