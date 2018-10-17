package com.et.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.data.annotation.Persistent;

@Entity
@Table(name="Farmer_Land_Mapping")
public class FarmLandMapping implements Serializable{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -7018317649703775941L;
	
	@Override
	public String toString() {
		return "FarmLandMapping [farmId=" + farmId + ", farmerName=" + farmerName + ", landDetails=" + landDetails
				+ ", areaOfLand=" + areaOfLand + ", sharePercentage=" + sharePercentage + ", season=" + season
				+ ", description=" + description + ", creator_id=" + creator_id + ", updator_id=" + updator_id
				+ ", createdOn=" + createdOn + "]";
	}
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)

	@Column(name="Farm_id")
	private long farmId;
	@Column(name="Farmer_Name")
	private String farmerName;
	@Column(name="Land_Details")
	private String landDetails;  
	@Column(name="AreaOfLand")
	private long areaOfLand     ;
	@Column(name="SharePercentage")
	private int sharePercentage ;
	@Column(name="Season")
	private String season        ;  
	@Column(name="Description")
	private String description    ; 
	@Column(name="creator_id",insertable=true,updatable=false)
	private long creator_id     ;
	@Column(name="updator_id",insertable=true,updatable=true)
	private int updator_id      ;
	@Column(name="createdOn",insertable=true,updatable=false)
	private Date createdOn       ;
	//private long updatedOn       
	public long getFarmId() {
		return this.farmId;
	}
	public void setFarmId(long farmId) {
		this.farmId = farmId;
	}
	public String getFarmerName() {
		return this.farmerName;
	}
	public void setFarmerName(String farmerName) {
		this.farmerName = farmerName;
	}
	public String getLandDetails() {
		return this.landDetails;
	}
	public void setLandDetails(String landDetails) {
		this.landDetails = landDetails;
	}
	public long getAreaOfLand() {
		return this.areaOfLand;
	}
	public void setAreaOfLand(long areaOfLand) {
		this.areaOfLand = areaOfLand;
	}
	public int getSharePercentage() {
		return this.sharePercentage;
	}
	public void setSharePercentage(int sharePercentage) {
		this.sharePercentage = sharePercentage;
	}
	public String getSeason() {
		return this.season;
	}
	public void setSeason(String season) {
		this.season = season;
	}
	public String getDescription() {
		return this.description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public long getCreator_id() {
		return this.creator_id;
	}
	public void setCreator_id(long creator_id) {
		this.creator_id = creator_id;
	}
	public int getUpdator_id() {
		return this.updator_id;
	}
	public void setUpdator_id(int updator_id) {
		this.updator_id = updator_id;
	}
	public Date getCreatedOn() {
		return this.createdOn;
	}
	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}



}
