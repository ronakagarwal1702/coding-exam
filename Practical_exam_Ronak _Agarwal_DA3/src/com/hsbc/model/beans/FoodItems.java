package com.hsbc.model.beans;

public class FoodItems extends Product {

	private String date_manufacture;
	private String date_expiry;
	private String vegetarain;
	
	public FoodItems() {
		super();
		// TODO Auto-generated constructor stub
	}

	public FoodItems(int item_code, String item_name, int unit_price, int quantity,String date_manufacture,String date_expiry,String vegetarain) {
		super(item_code, item_name, unit_price, quantity);
		this.date_expiry=date_expiry;
		this.date_manufacture=date_manufacture;
		this.vegetarain=vegetarain;
		// TODO Auto-generated constructor stub
	}

	public String getDate_manufacture() {
		return date_manufacture;
	}

	public void setDate_manufacture(String date_manufacture) {
		this.date_manufacture = date_manufacture;
	}

	public String getDate_expiry() {
		return date_expiry;
	}

	public void setDate_expiry(String date_expiry) {
		this.date_expiry = date_expiry;
	}

	public String getVegetarain() {
		return vegetarain;
	}

	public void setVegetarain(String vegetarain) {
		this.vegetarain = vegetarain;
	}
	
	@Override
	public String toString() {
		return "Electronics [Item code="+ getItem_code() + ", Item name=" +getItem_name() +", Quantity Sold=" + getQuantity()+"Vegetarain="+getVegetarain() 
				 + "]";
	}
	
	

}
