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
	private static final Long serialVersionUID = -7018317649703775941L;
	
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
	private Long farmId;
	@Column(name="Farmer_Name")
	private String farmerName;
	@Column(name="Land_Details")
	private String landDetails;  
	@Column(name="AreaOfLand")
	private Long areaOfLand     ;
	@Column(name="SharePercentage")
	private Integer sharePercentage ;
	@Column(name="Season")
	private String season        ;  
	@Column(name="Description")
	private String description    ; 
	@Column(name="creator_id",insertable=true,updatable=false)
	private Long creator_id     ;
	@Column(name="updator_id",insertable=false,updatable=true)
	private Long updator_id      ;
	@Column(name="createdOn",insertable=true,updatable=false)
	private Date createdOn       ;
	//private Long updatedOn       
	public Long getFarmId() {
		return this.farmId;
	}
	public void setFarmId(Long farmId) {
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
	public Long getAreaOfLand() {
		return this.areaOfLand;
	}
	public void setAreaOfLand(Long areaOfLand) {
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
	public Long getCreator_id() {
		return this.creator_id;
	}
	public void setCreator_id(Long creator_id) {
		this.creator_id = creator_id;
	}
	public Long getUpdator_id() {
		return this.updator_id;
	}
	public void setUpdator_id(Long updator_id) {
		this.updator_id = updator_id;
	}
	public Date getCreatedOn() {
		return this.createdOn;
	}
	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}



}
