package com.revature.beans;

import javax.persistence.*;

@Entity
@Table(name="IMS_PO_LINE")
public class POLine {
	
		@Column(name="ORDER_NUMBER")
	private PurchaseOrder orderNumber;
	
		@Id
		@Column(name="LINE_NUMBER")
	private int lineNumber;
		@Column(name="UNIT_PRICE")
	private double unitPrice;
		@Column(name="QUANTITY_ORDERED")
	private int quantityOrdered;
		@Column(name="PRODUCT_UPC")
	private Product productUpc;
		
	
	public PurchaseOrder getOrderNumber() {
		return orderNumber;
	}
	public void setOrderNumber(PurchaseOrder orderNumber) {
		this.orderNumber = orderNumber;
	}
	public int getLineNumber() {
		return lineNumber;
	}
	public void setLineNumber(int lineNumber) {
		this.lineNumber = lineNumber;
	}
	public double getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}
	public int getQuantityOrdered() {
		return quantityOrdered;
	}
	public void setQuantityOrdered(int quantityOrdered) {
		this.quantityOrdered = quantityOrdered;
	}
	public Product getProductUpc() {
		return productUpc;
	}
	public void setProductUpc(Product productUpc) {
		this.productUpc = productUpc;
	}
	public POLine(PurchaseOrder orderNumber, int lineNumber, double unitPrice, int quantityOrdered,
			Product productUpc) {
		super();
		this.orderNumber = orderNumber;
		this.lineNumber = lineNumber;
		this.unitPrice = unitPrice;
		this.quantityOrdered = quantityOrdered;
		this.productUpc = productUpc;
	}
	public POLine() {
		super();
		// TODO Auto-generated constructor stub
	}


}
