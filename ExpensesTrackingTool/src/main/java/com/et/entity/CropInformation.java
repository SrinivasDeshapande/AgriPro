package com.et.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Crop_Information")
public class CropInformation {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="crop_id")
	private long cropId;
	@Column(name="CropName")
	private String cropName;
	@Column(name="Description")
	private String description    ; 
	@Column(name="Farm_id")
	private long farmid     ;
	@Column(name="creator_id")
	private long creator_id     ;
	@Column(name="updator_id")
	private long updator_id      ;
	@Column(name="createdOn")
	private Date createdOn       ;
	//private long updatedOn       
	public long getCropId() {
		return cropId;
	}
	public void setCropId(long cropId) {
		this.cropId = cropId;
	}
	public String getCropName() {
		return cropName;
	}
	public void setCropName(String cropName) {
		this.cropName = cropName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public long getFarmid() {
		return farmid;
	}
	public void setFarmid(long farmid) {
		this.farmid = farmid;
	}
	public long getCreator_id() {
		return creator_id;
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
