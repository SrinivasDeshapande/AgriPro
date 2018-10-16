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


}
