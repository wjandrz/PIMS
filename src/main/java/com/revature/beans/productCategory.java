package com.revature.beans;

import javax.persistence.*;

@Entity
@Table(name="IMS_PRODUCT_CATEGORY")
public class productCategory {
	
	@Id
	@Column(name="CATEGORY_ID")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int categoryId;
	
	@Column(name="CATEGORY_DESCRIPTION")
	private String categoryDescription;

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	public String getCategoryDescription() {
		return categoryDescription;
	}

	public void setCategoryDescription(String categoryDescription) {
		this.categoryDescription = categoryDescription;
	}

	public productCategory(int categoryId, String categoryDescription) {
		super();
		this.categoryId = categoryId;
		this.categoryDescription = categoryDescription;
	}

	public productCategory() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
		

}
