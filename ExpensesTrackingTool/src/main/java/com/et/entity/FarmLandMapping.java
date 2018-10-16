package com.et.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="Farmer_Land_Mapping")
public class FarmLandMapping {
		@Column(name="Farm_id")
	private long farmId;         
	private String Farmer_Name;     
	private String Land_Details;    
	private long AreaOfLand     ; 
	private int SharePercentage ;
	private String Season        ;  
	private String Description    ; 
	private long creator_id     ;
	private long updator_id      ;
	private long createdOn       ;
	//private long updatedOn       

	public long getFarmId() {
		return farmId;
	}
	public void setFarmId(long farmId) {
		this.farmId = farmId;
	}
	public String getFarmer_Name() {
		return Farmer_Name;
	}
	public void setFarmer_Name(String farmer_Name) {
		Farmer_Name = farmer_Name;
	}
	public String getLand_Details() {
		return Land_Details;
	}
	public void setLand_Details(String land_Details) {
		Land_Details = land_Details;
	}
	public long getAreaOfLand() {
		return AreaOfLand;
	}
	public void setAreaOfLand(long areaOfLand) {
		AreaOfLand = areaOfLand;
	}
	public int getSharePercentage() {
		return SharePercentage;
	}
	public void setSharePercentage(int sharePercentage) {
		SharePercentage = sharePercentage;
	}
	public String getSeason() {
		return Season;
	}
	public void setSeason(String season) {
		Season = season;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
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
