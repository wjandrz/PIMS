package com.revature.beans;

import javax.persistence.*;

@Entity
@Table(name="IMS_PO_LINE")
public class POLine {
	
		@EmbeddedId
	private POCompKey compKey;
		@Column(name="UNIT_PRICE")
	private double unitPrice;
		@Column(name="QUANTITY_ORDERED")
	private int quantityOrdered;
		@Column(name="PRODUCT_UPC")
	private Product productUpc;
		
	public POCompKey getCompKey() {
			return compKey;
		}
		public void setCompKey(POCompKey compKey) {
			this.compKey = compKey;
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
	public POLine(POCompKey compKey, double unitPrice, int quantityOrdered,
			Product productUpc) {
		super();
		this.compKey = compKey;
		this.unitPrice = unitPrice;
		this.quantityOrdered = quantityOrdered;
		this.productUpc = productUpc;
	}
	public POLine() {
		super();
		// TODO Auto-generated constructor stub
	}


}
