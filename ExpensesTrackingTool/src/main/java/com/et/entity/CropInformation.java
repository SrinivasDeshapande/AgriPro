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

	@Override
	public String toString() {
		return "CropInformation [cropId=" + cropId + ", cropName=" + cropName + ", description=" + description
				+ ", farmid=" + farmid + ", creator_id=" + creator_id + ", updator_id=" + updator_id + ", createdOn="
				+ createdOn + "]";
	}
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="crop_id")
	private Long cropId;
	@Column(name="CropName")
	private String cropName;
	@Column(name="Description")
	private String description    ; 
	
	@Column(name="Farm_id",nullable=false)
	private Long farmid     ;
	@Column(name="creator_id" ,insertable=true,updatable=false)
	private Long creator_id     ;
	@Column(name="updator_id" ,insertable=false,updatable=true)
	private Long updator_id      ;
	@Column(name="createdOn" ,insertable=true,updatable=false)
	private Date createdOn       ;
	//private Long updatedOn       
	public Long getCropId() {
		return cropId;
	}
	public void setCropId(Long cropId) {
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
	public Long getFarmid() {
		return farmid;
	}
	public void setFarmid(Long farmid) {
		this.farmid = farmid;
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
	public Date getCreatedOn() {
		return createdOn;
	}
	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}



}
