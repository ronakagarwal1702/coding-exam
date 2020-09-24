package com.hsbc.model.utility;

import com.hsbc.model.business.GeneralServiceImpl;
import com.hsbc.model.dao.GeneralDaoImpl;

public class FactoryPattern {
	
	public static Object getInstance(Type type)
	{
		Object obj=null;
		switch(type)
		{
		case SERVICE:
		 	obj=new GeneralServiceImpl();
			break;
		case DAO:
			obj=new GeneralDaoImpl();
			break;
		}
		return obj;
	}

}
