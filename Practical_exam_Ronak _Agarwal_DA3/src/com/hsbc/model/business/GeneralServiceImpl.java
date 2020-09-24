package com.hsbc.model.business;

import java.util.ArrayList;

import com.hsbc.exception.ItemsAreNotFound;
import com.hsbc.model.beans.Apparel;
import com.hsbc.model.beans.Electronics;
import com.hsbc.model.beans.FoodItems;
import com.hsbc.model.dao.GeneralDao;
import com.hsbc.model.utility.FactoryPattern;
import com.hsbc.model.utility.Type;

public class GeneralServiceImpl implements GeneralService {
	
	GeneralDao dao=(GeneralDao)FactoryPattern.getInstance(Type.DAO);
	@Override
	public Electronics storeElectronics(Electronics electronics) {
		dao.storeElectronics(electronics);
		return electronics;
	}

	@Override
	public FoodItems storeFood(FoodItems food) {
		dao.storeFood(food);
		return food;
	}

	@Override
	public Apparel storeApparel(Apparel apparel) {
		dao.storeApparel(apparel);
		return apparel;
	}

	@Override
	public ArrayList<Electronics> getTop3Electronics() throws ItemsAreNotFound {
		
		ArrayList<Electronics> electronics2= dao.getTop3Electronics();
		if(electronics2.size()<3)
		{
			throw new ItemsAreNotFound();
		}
		return electronics2;
	}

	@Override
	public ArrayList<FoodItems> getTop3AFoodItems() throws ItemsAreNotFound {
		ArrayList<FoodItems> food2 =dao.getTop3AFoodItems();
		
		if(food2.size()<3)
		{
			throw new ItemsAreNotFound();
		}
		return food2;
	}

	@Override
	public ArrayList<Apparel> getTop3Apparel() throws ItemsAreNotFound {
		ArrayList<Apparel> apparel2=dao.getTop3Apparel();
		if(apparel2.size()<3)
		{
			throw new ItemsAreNotFound();
		}
		return apparel2;
	}

}
