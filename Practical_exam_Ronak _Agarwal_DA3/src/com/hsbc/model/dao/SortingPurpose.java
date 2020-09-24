package com.hsbc.model.dao;

import java.util.*;

import com.hsbc.model.beans.*;

public class SortingPurpose {
	
	class sortItemByQuantity1 implements Comparator<Electronics>
	{

		@Override
		public int compare(Electronics o1, Electronics o2)
		{
		return o2.getQuantity()-o1.getQuantity();
		}
		
	}
	class sortItemByQuantity2 implements Comparator<Apparel>
	{

		@Override
		public int compare(Apparel o1, Apparel  o2)
		{
		  return o2.getQuantity()-o1.getQuantity();
		}
		
	}
	class sortItemByQuantity3 implements Comparator<FoodItems>
	{

		@Override
		public int compare(FoodItems o1,FoodItems o2)
		{
		return o2.getQuantity()-o1.getQuantity();
		}
		
	}

}
