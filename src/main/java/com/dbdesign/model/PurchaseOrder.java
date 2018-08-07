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
@Table(name = "purchase_order")
public class PurchaseOrder {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "po_id")
	private Long id;

	@Column(name = "po_number")
	private Long poNumber;

	@Column
	private String name;

	@Column
	private String details;

	@Column
	private Double subtotal;

	@Column
	private Double tax;

	@Column
	private Double shippingAndHandling;

	@Column
	private Double total;

	@Column
	private String status;

	@Column
	private String trackingId;

	@Column
	private String trackingLink;

	@Column
	private String invoiceUpload;

	@Column
	private Double invoiceAmount;

	@Column
	private String invoiceCurrency;

	@OneToMany
	@JoinTable(name = "PO_ITEM", joinColumns = @JoinColumn(name = "PO_ID"), inverseJoinColumns = @JoinColumn(name = "ITEM_ID"))
	private Collection<PurchaseOrderItem> purchaseOrderItems;

	@ManyToMany(cascade = { CascadeType.PERSIST, CascadeType.MERGE })
	@JoinTable(name = "PO_BC", joinColumns = @JoinColumn(name = "PO_ID"), inverseJoinColumns = @JoinColumn(name = "BC_ID"))
	private Collection<BusinessContactInfo> businessContactInfos;

	@JoinColumn(name = "shipping_address_id")
	@OneToOne(cascade = CascadeType.ALL)
	private ShippingAddress shippingAddress;

	@JoinColumn(name = "supplier_id")
	@OneToOne(cascade = CascadeType.ALL)
	private Supplier supplier;

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getTrackingId() {
		return trackingId;
	}

	public void setTrackingId(String trackingId) {
		this.trackingId = trackingId;
	}

	public String getTrackingLink() {
		return trackingLink;
	}

	public void setTrackingLink(String trackingLink) {
		this.trackingLink = trackingLink;
	}

	public String getInvoiceUpload() {
		return invoiceUpload;
	}

	public void setInvoiceUpload(String invoiceUpload) {
		this.invoiceUpload = invoiceUpload;
	}

	public Double getInvoiceAmount() {
		return invoiceAmount;
	}

	public void setInvoiceAmount(Double invoiceAmount) {
		this.invoiceAmount = invoiceAmount;
	}

	public String getInvoiceCurrency() {
		return invoiceCurrency;
	}

	public void setInvoiceCurrency(String invoiceCurrency) {
		this.invoiceCurrency = invoiceCurrency;
	}

	public Supplier getSupplier() {
		return supplier;
	}

	public void setSupplier(Supplier supplier) {
		this.supplier = supplier;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getPoNumber() {
		return poNumber;
	}

	public void setPoNumber(Long poNumber) {
		this.poNumber = poNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	public Double getSubtotal() {
		return subtotal;
	}

	public void setSubtotal(Double subtotal) {
		this.subtotal = subtotal;
	}

	public Double getTax() {
		return tax;
	}

	public void setTax(Double tax) {
		this.tax = tax;
	}

	public Double getShippingAndHandling() {
		return shippingAndHandling;
	}

	public void setShippingAndHandling(Double shippingAndHandling) {
		this.shippingAndHandling = shippingAndHandling;
	}

	public Double getTotal() {
		return total;
	}

	public void setTotal(Double total) {
		this.total = total;
	}

	public Collection<PurchaseOrderItem> getPurchaseOrderItems() {
		return purchaseOrderItems;
	}

	public void setPurchaseOrderItems(Collection<PurchaseOrderItem> purchaseOrderItems) {
		this.purchaseOrderItems = purchaseOrderItems;
	}

	public Collection<BusinessContactInfo> getBusinessContactInfos() {
		return businessContactInfos;
	}

	public void setBusinessContactInfos(Collection<BusinessContactInfo> businessContactInfos) {
		this.businessContactInfos = businessContactInfos;
	}

	public ShippingAddress getShippingAddress() {
		return shippingAddress;
	}

	public void setShippingAddress(ShippingAddress shippingAddress) {
		this.shippingAddress = shippingAddress;
	}

}
