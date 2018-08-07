package com.dbdesign.model;

import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "businessContactInfo")
public class BusinessContactInfo {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "bc_id")
	private Long id;

	@JoinColumn(name = "user_profile_id")
	@OneToOne(cascade = CascadeType.ALL)
	private UserProfile userProfile;

	@JoinColumn(name = "business_profile_id")
	@OneToOne(cascade = CascadeType.ALL)
	private BusinessProfile businessProfile;

	@ManyToMany(mappedBy = "purchseOrders")
	private Collection<PurchaseOrder> purchseOrders;

	public BusinessContactInfo() {

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public UserProfile getUserProfile() {
		return userProfile;
	}

	public void setUserProfile(UserProfile userProfile) {
		this.userProfile = userProfile;
	}

	public BusinessProfile getBusinessProfile() {
		return businessProfile;
	}

	public void setBusinessProfile(BusinessProfile businessProfile) {
		this.businessProfile = businessProfile;
	}

	public Collection<PurchaseOrder> getPurchseOrders() {
		return purchseOrders;
	}

	public void setPurchseOrders(Collection<PurchaseOrder> purchseOrders) {
		this.purchseOrders = purchseOrders;
	}

}
