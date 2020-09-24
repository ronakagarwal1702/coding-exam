package com.hsbc.model.business;

import java.util.ArrayList;

import com.hsbc.exception.ItemsAreNotFound;
import com.hsbc.model.beans.Apparel;
import com.hsbc.model.beans.Electronics;
import com.hsbc.model.beans.FoodItems;

public interface GeneralService {
	
	Electronics storeElectronics(Electronics electronics);
	FoodItems storeFood(FoodItems food);
	Apparel storeApparel(Apparel apparel);
	ArrayList<Electronics> getTop3Electronics() throws ItemsAreNotFound ;
	ArrayList<FoodItems> getTop3AFoodItems() throws ItemsAreNotFound ;
	ArrayList<Apparel> getTop3Apparel() throws ItemsAreNotFound ;
	
	
	

}
