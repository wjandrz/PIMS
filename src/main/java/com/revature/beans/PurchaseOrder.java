package com.revature.beans;

import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name="IMS_PURCHASE_ORDER")
public class PurchaseOrder {
	
		@Id
		@Column(name="ORDER_NUMBER")
	private int orderNumber;
		@Column(name="SUBTOTAL")
	private double subtotal;
		@Column(name="PURCHASE_DATE")
	private Date purchaseDate;
		@Column(name="TAX_AMOUNT")
	private double taxAmount;
		@Column(name="PO_TOTAL")
	private double poTotal;
		@Column(name="CLIENT_ID")
	private Client clientId;
		
	
	public int getOrderNumber() {
		return orderNumber;
	}
	public void setOrderNumber(int orderNumber) {
		this.orderNumber = orderNumber;
	}
	public double getSubtotal() {
		return subtotal;
	}
	public void setSubtotal(double subtotal) {
		this.subtotal = subtotal;
	}
	public Date getPurchaseDate() {
		return purchaseDate;
	}
	public void setPurchaseDate(Date purchaseDate) {
		this.purchaseDate = purchaseDate;
	}
	public double getTaxAmount() {
		return taxAmount;
	}
	public void setTaxAmount(double taxAmount) {
		this.taxAmount = taxAmount;
	}
	public double getPoTotal() {
		return poTotal;
	}
	public void setPoTotal(double poTotal) {
		this.poTotal = poTotal;
	}
	public Client getClientId() {
		return clientId;
	}
	public void setClientId(Client clientId) {
		this.clientId = clientId;
	}
	public PurchaseOrder(int orderNumber, double subtotal, Date purchaseDate, double taxAmount, double poTotal,
			Client clientId) {
		super();
		this.orderNumber = orderNumber;
		this.subtotal = subtotal;
		this.purchaseDate = purchaseDate;
		this.taxAmount = taxAmount;
		this.poTotal = poTotal;
		this.clientId = clientId;
	}
	public PurchaseOrder() {
		super();
		// TODO Auto-generated constructor stub
	}

	


}
