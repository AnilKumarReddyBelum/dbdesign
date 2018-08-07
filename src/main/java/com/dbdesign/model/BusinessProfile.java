package com.dbdesign.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "businessProfile")
public class BusinessProfile {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "business_profile_id")
	private Long id;

	@Column(name = "legal_entity")
	private String legalEntity;

	@Column(name = "management_entity")
	private String managementEntity;

	@Column(name = "business_address")
	private String businessAddress;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getLegalEntity() {
		return legalEntity;
	}

	public void setLegalEntity(String legalEntity) {
		this.legalEntity = legalEntity;
	}

	public String getManagementEntity() {
		return managementEntity;
	}

	public void setManagementEntity(String managementEntity) {
		this.managementEntity = managementEntity;
	}

	public String getBusinessAddress() {
		return businessAddress;
	}

	public void setBusinessAddress(String businessAddress) {
		this.businessAddress = businessAddress;
	}

}
