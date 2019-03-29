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

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonMerge;
import com.fasterxml.jackson.annotation.OptBoolean;


@Entity
@DynamicUpdate
@Table(name="Billing_Information")
public class BillingInformation implements Serializable {


	/**
	 * 
	 */
	private static final long serialVersionUID = -6126616233418621123L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Bill_id")
	private Long billId;
	@Column(name="BillerName")
	private String billerName;
	@Column(name="BillNo")
	private Long billNo;
	
	@Override
	public String toString() {
		return "BillingInformation [billId=" + billId + ", billerName=" + billerName + ", billNo=" + billNo
				+ ", description=" + description + ", billDate=" + billDate + ", creator_id=" + creator_id
				+ ", updator_id=" + updator_id + ", createdOn=" + createdOn + "]";
	}
	@Column(name="Description")
	
	private String description    ; 
	
	@Column(name="billDate")
	private Date billDate;
	
	
	@Column(name="creator_id" ,insertable=true,updatable=false)
	private Long creator_id     ;
	@Column(name="updator_id" ,insertable=false,updatable=true)
	
	private Long updator_id      ;
	@Column(name="createdOn" ,insertable=true,updatable=false)
	@CreationTimestamp
	private LocalDateTime createdOn       ;
	//private Long updatedOn       
	
	public Long getBillNo() {
		return billNo;
	}
	public void setBillNo(Long billNo) {
		this.billNo = billNo;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	public Long getCreator_id() {
		return creator_id;
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

	public Long getBillId() {
		return billId;
	}
	public void setBillId(Long billId) {
		this.billId = billId;
	}
	public String getBillerName() {
		return billerName;
	}
	public void setBillerName(String billerName) {
		this.billerName = billerName;
	}
	public Date getBillDate() {
		return billDate;
	}
	public void setBillDate(Date billDate) {
		this.billDate = billDate;
	}
}
