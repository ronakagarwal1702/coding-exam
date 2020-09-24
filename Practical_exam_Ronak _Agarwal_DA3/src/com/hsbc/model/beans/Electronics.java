package com.hsbc.model.beans;

public class Electronics extends Product {
	
	private int warranty;
	public Electronics() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Electronics(int item_code, String item_name, int unit_price, int quantity,int warrranty) {
		super(item_code, item_name, unit_price, quantity);
		this.warranty=warrranty;
		
	}

	public int getWarranty() {
		return warranty;
	}

	public void setWarranty(int warranty) {
		this.warranty = warranty;
	}

	@Override
	public String toString() {
		return "Electronics [Item code="+ getItem_code() + ", Item name=" +getItem_name() +", Quantity Sold=" + getQuantity()+",Warranty=" + getWarranty() 
				+  "]";
	}
	
	
	
}
