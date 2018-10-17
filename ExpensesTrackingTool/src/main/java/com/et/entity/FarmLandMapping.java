package com.et.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="Farmer_Land_Mapping")
public class FarmLandMapping {
		@Column(name="Farm_id")
	private long farmId;
		@Column(name="Farmer_name")
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
@Column(name="creator_id")
		private long creator_id     ;
@Column(name="updator_id")
private long updator_id      ;
@Column(name="createdOn")
	private long createdOn       ;
	//private long updatedOn       

	public long getFarmId() {
		return farmId;
	}
	public void setFarmId(long farmId) {
		this.farmId = farmId;
	}
	public String getFarmer_Name() {
		return farmerName;
	}
	public void setFarmer_Name(String farmer_Name) {
		this.farmerName = farmer_Name;
	}
	public String getLand_Details() {
		return landDetails;
	}
	public void setLand_Details(String land_Details) {
		this.landDetails = land_Details;
	}
	public long getAreaOfLand() {
		return areaOfLand;
	}
	public void setAreaOfLand(long areaOfLand) {
		this.areaOfLand = areaOfLand;
	}
	public int getSharePercentage() {
		return sharePercentage;
	}
	public void setSharePercentage(int sharePercentage) {
		this.sharePercentage = sharePercentage;
	}
	public String getSeason() {
		return season;
	}
	public void setSeason(String season) {
		this.season = season;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
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
	public long getCreatedOn() {
		return createdOn;
	}
	public void setCreatedOn(long createdOn) {
		this.createdOn = createdOn;
	}


}
