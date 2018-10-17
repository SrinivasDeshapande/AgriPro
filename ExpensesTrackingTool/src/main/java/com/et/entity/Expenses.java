package com.et.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Expenses")
public class Expenses {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	@Column(name="Exp_id")
	private long expId;
	@Column(name="Name")
	private String name;
	@Column(name="type_id")
	private long typeId    ;
	@Column(name="DateOfExp")
	private Date dateOfExp    ;
	@Column(name="Quantity")
	private double quantity    ;
	@Column(name="Rate")
	private double rate    ;
	@Column(name="Amount")
	private double amount    ;
	@Column(name="Discount")
	private double discount    ;
	@Column(name="Bill_id")
	private double billId    ;
	@Column(name="Description")
	private String description    ;
	@Column(name="crop_id")
	private long cropId    ;
	@Column(name="Bill_id")
	private long farmid    ;
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
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public long getExpId() {
		return expId;
	}
	public void setExpId(long expId) {
		this.expId = expId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getTypeId() {
		return typeId;
	}
	public void setTypeId(long typeId) {
		this.typeId = typeId;
	}
	public Date getDateOfExp() {
		return dateOfExp;
	}
	public void setDateOfExp(Date dateOfExp) {
		this.dateOfExp = dateOfExp;
	}
	public double getQuantity() {
		return quantity;
	}
	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}
	public double getRate() {
		return rate;
	}
	public void setRate(double rate) {
		this.rate = rate;
	}
	public double getDiscount() {
		return discount;
	}
	public void setDiscount(double discount) {
		this.discount = discount;
	}
	public double getBillId() {
		return billId;
	}
	public void setBillId(double billId) {
		this.billId = billId;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public long getCropId() {
		return cropId;
	}
	public void setCropId(long cropId) {
		this.cropId = cropId;
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
