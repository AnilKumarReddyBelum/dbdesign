package com.dbdesign.model;

import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "supplier")
public class Supplier {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "sid")
	private Long id;

	@Column
	private String name;

	@Column
	private String emailId;

	@Column
	private String phone;

	@Column
	private String companyPhone;

	@Column
	private String webSite;

	@JoinColumn(name = "supplier_address_id")
	@OneToOne(cascade = CascadeType.ALL)
	private SupplierAddress supplierAddress;

	@ManyToMany(cascade = { CascadeType.PERSIST, CascadeType.MERGE })
	@JoinTable(name = "SUPPLIER_BC", joinColumns = @JoinColumn(name = "sid"), inverseJoinColumns = @JoinColumn(name = "BC_ID"))
	private Collection<BusinessContactInfo> businessContactInfos;

	@OneToMany
	@JoinTable(name = "SUPPLIER_PO", joinColumns = @JoinColumn(name = "SID"), inverseJoinColumns = @JoinColumn(name = "PO_ID"))
	private Collection<PurchaseOrder> purchaseOrders;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getCompanyPhone() {
		return companyPhone;
	}

	public void setCompanyPhone(String companyPhone) {
		this.companyPhone = companyPhone;
	}

	public String getWebSite() {
		return webSite;
	}

	public void setWebSite(String webSite) {
		this.webSite = webSite;
	}

	public SupplierAddress getSupplierAddress() {
		return supplierAddress;
	}

	public void setSupplierAddress(SupplierAddress supplierAddress) {
		this.supplierAddress = supplierAddress;
	}

	public Collection<BusinessContactInfo> getBusinessContactInfos() {
		return businessContactInfos;
	}

	public void setBusinessContactInfos(Collection<BusinessContactInfo> businessContactInfos) {
		this.businessContactInfos = businessContactInfos;
	}

	public Collection<PurchaseOrder> getPurchaseOrders() {
		return purchaseOrders;
	}

	public void setPurchaseOrders(Collection<PurchaseOrder> purchaseOrders) {
		this.purchaseOrders = purchaseOrders;
	}

}
