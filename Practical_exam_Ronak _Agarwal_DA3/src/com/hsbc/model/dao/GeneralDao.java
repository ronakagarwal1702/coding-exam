package com.hsbc.model.dao;

import java.util.ArrayList;

import com.hsbc.model.beans.Apparel;
import com.hsbc.model.beans.Electronics;
import com.hsbc.model.beans.FoodItems;

public interface GeneralDao {
	
	Electronics storeElectronics(Electronics electronics);
	FoodItems storeFood(FoodItems food);
	Apparel storeApparel(Apparel apparel);
	ArrayList<Electronics> getTop3Electronics();
	ArrayList<FoodItems> getTop3AFoodItems();
	ArrayList<Apparel> getTop3Apparel();
}
