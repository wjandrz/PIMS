package com.revature.beans;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.SequenceGenerator;

@Embeddable
public class POCompKey implements Serializable{

	private static final long serialVersionUID = 1L;

		@Column(name="ORDER_NUMBER", nullable=false)
	private PurchaseOrder orderNumber;

		@Column(name="LINE_NUMBER", nullable=false)
		@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="poLineSeq")
		@SequenceGenerator(name="poLineSeq", sequenceName="PO_LINE_SEQ",initialValue=1, allocationSize=1)
	private int lineNumber;

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

	public POCompKey(PurchaseOrder orderNumber, int lineNumber) {
		super();
		this.orderNumber = orderNumber;
		this.lineNumber = lineNumber;
	}

	public POCompKey() {
		super();
	}
}
