package com.dbdesign.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "supplier_address")
public class SupplierAddress {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "supplier_address_id")
	private Long id;

	@Column
	private String attentionTo;

	@Column
	private String companyName;

	@Column
	private String address;

	@Column
	private String phone;

	@Column
	private String salesPersonName;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAttentionTo() {
		return attentionTo;
	}

	public void setAttentionTo(String attentionTo) {
		this.attentionTo = attentionTo;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getSalesPersonName() {
		return salesPersonName;
	}

	public void setSalesPersonName(String salesPersonName) {
		this.salesPersonName = salesPersonName;
	}

}
