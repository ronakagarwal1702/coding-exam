package com.hsbc.model.dao;

import java.util.ArrayList;
import java.util.Collections;

import com.hsbc.model.beans.Apparel;
import com.hsbc.model.beans.Electronics;
import com.hsbc.model.beans.FoodItems;


public class GeneralDaoImpl implements GeneralDao {
	
	
	ArrayList<Electronics> electronics1=new ArrayList<Electronics>(); // To store electronics
	ArrayList<FoodItems> food1=new ArrayList<FoodItems>(); // To store ItemFood
	ArrayList<Apparel> apparel1=new ArrayList<Apparel>();  // To store Apparel

	@Override
	// STORE ELECTRONICS
	public Electronics storeElectronics(Electronics electronics) {
		electronics1.add(electronics);
		return electronics;
	}

	@Override
	// STORE FOODITEMS
	public FoodItems storeFood(FoodItems food) {  
		food1.add(food);
		return food;
	}

	@Override
	// STORE APPAREL
	public Apparel storeApparel(Apparel apparel) {
		apparel1.add(apparel);
		return apparel;
	}

	@Override
	// RETURN TOP 3 ELECTRONICS
	public ArrayList<Electronics> getTop3Electronics() {
		SortingPurpose mysort=new SortingPurpose();
		Collections.sort(electronics1, mysort.new sortItemByQuantity1());
		return electronics1;
	}

	@Override
	// RETURN TOP 3 FOODITEMS
	public ArrayList<FoodItems> getTop3AFoodItems() {
		SortingPurpose mysort=new SortingPurpose();
		Collections.sort(food1, mysort.new sortItemByQuantity3());
		return food1;
	}

	@Override
	// RETURN TOP 3 APPAREL
	public ArrayList<Apparel> getTop3Apparel() {
		SortingPurpose mysort=new SortingPurpose();
		Collections.sort(apparel1, mysort.new sortItemByQuantity2());
		return apparel1;
	}

}
