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
	
	
	@Override
	public String toString() {
		return "Expenses [expId=" + expId + ", name=" + name + ", typeId=" + typeId + ", dateOfExp=" + dateOfExp
				+ ", quantity=" + quantity + ", rate=" + rate + ", amount=" + amount + ", discount=" + discount
				+ ", billId=" + billId + ", description=" + description + ", cropId=" + cropId + ", farmid=" + farmid
				+ ", creator_id=" + creator_id + ", updator_id=" + updator_id + ", createdOn=" + createdOn + "]";
	}
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)

	@Column(name="Exp_id")
	private Long expId;
	@Column(name="Name")
	private String name;
	@Column(name="type_id")
	private Long typeId    ;
	@Column(name="DateOfExp")
	private Date dateOfExp    ;
	@Column(name="Quantity")
	private Double quantity    ;
	@Column(name="Rate")
	private Double rate    ;
	@Column(name="Amount")
	private Double amount    ;
	@Column(name="Discount")
	private Double discount    ;
	@Column(name="Bill_id")
	private Double billId    ;
	@Column(name="Description")
	private String description    ;
	@Column(name="crop_id")
	private Long cropId    ;
	@Column(name="Farm_id")
	private Long farmid    ;
	@Column(name="creator_id",insertable=true,updatable=false)
	private Long creator_id     ;
	@Column(name="updator_id",insertable=false,updatable=true)
	private Long updator_id      ;
	@Column(name="createdOn" ,insertable=true,updatable=false)
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
	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	public Long getExpId() {
		return expId;
	}
	public void setExpId(Long expId) {
		this.expId = expId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getTypeId() {
		return typeId;
	}
	public void setTypeId(Long typeId) {
		this.typeId = typeId;
	}
	public Date getDateOfExp() {
		return dateOfExp;
	}
	public void setDateOfExp(Date dateOfExp) {
		this.dateOfExp = dateOfExp;
	}
	public Double getQuantity() {
		return quantity;
	}
	public void setQuantity(Double quantity) {
		this.quantity = quantity;
	}
	public Double getRate() {
		return rate;
	}
	public void setRate(Double rate) {
		this.rate = rate;
	}
	public Double getDiscount() {
		return discount;
	}
	public void setDiscount(Double discount) {
		this.discount = discount;
	}
	public Double getBillId() {
		return billId;
	}
	public void setBillId(Double billId) {
		this.billId = billId;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Long getCropId() {
		return cropId;
	}
	public void setCropId(Long cropId) {
		this.cropId = cropId;
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
	public Date getCreatedOn() {
		return createdOn;
	}
	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}



}
