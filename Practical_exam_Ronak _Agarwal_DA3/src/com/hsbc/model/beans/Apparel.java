package com.hsbc.model.beans;

public class Apparel extends Product {

	private String size;
	private String material;
	
	public Apparel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Apparel(int item_code, String item_name, int unit_price, int quantity,String size,String material) {
		super(item_code, item_name, unit_price, quantity);
		this.size=size;
		this.material=material;
		// TODO Auto-generated constructor stub
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}
	
	@Override
	public String toString() {
		return "Electronics [Item code="+ getItem_code() + ", Item name=" +getItem_name() +", Quantity Sold=" + getQuantity()+",Size=" + getSize() + ",Material= "+getMaterial()
				 + "]";
	}
	

}
