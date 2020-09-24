package com.hsbc.model.beans;

public class Product {
	
	// This is super class for all Items (Electronics FoodItems,Apparel
	private int item_code;
	private String item_name;
	private int unit_price;
	private int quantity;
	
	public Product(int item_code, String item_name, int unit_price, int quantity) {
		super();
		this.item_code = item_code;
		this.item_name = item_name;
		this.unit_price = unit_price;
		this.quantity = quantity;
	}

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getItem_code() {
		return item_code;
	}

	public void setItem_code(int item_code) {
		this.item_code = item_code;
	}

	public String getItem_name() {
		return item_name;
	}

	public void setItem_name(String item_name) {
		this.item_name = item_name;
	}

	public int getUnit_price() {
		return unit_price;
	}

	public void setUnit_price(int unit_price) {
		this.unit_price = unit_price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	

}
