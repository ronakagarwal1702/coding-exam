package com.hsbc.controller;
import java.util.*;
import com.hsbc.model.utility.*;
import com.hsbc.model.business.*;
import com.hsbc.exception.ItemsAreNotFound;
import com.hsbc.model.beans.*;
public class MainViewController {
	
	public static void main(String args[])
	{
		Scanner scanner=new Scanner(System.in);
		int option=0; // this is for using do while loop
		GeneralService service=(GeneralService)FactoryPattern.getInstance(Type.SERVICE);
		
		do
		{
			System.out.println("******************************************************************************************************************************************");
			System.out.println("1.Store Electronics 2.Store Apparel 3. Store FoodItems 4.Extract Top Electronics 5. Extract Top Apparel   6. Extract Top FoodItems 7. Exit");
			System.out.println("******************************************************************************************************************************************");
			System.out.println("Enter the option");
			option=scanner.nextInt();
			
			switch(option)
			{
			case 1:
				System.out.println("Enter the ItemCode");
				int item_code=scanner.nextInt();
				System.out.println("Enter the ItemName");
				String name=scanner.next();
				System.out.println("Enter the  unit price");
				int price=scanner.nextInt();
				System.out.println("Enter the Warranty");
				int warranty=scanner.nextInt();
				System.out.println("Enter the Quantity");
				int quantity=scanner.nextInt();
				Electronics electronics=new Electronics(item_code,name,price,quantity,warranty);
				Electronics electronics1=service.storeElectronics(electronics);
				break;
				
			case 2:
				
				System.out.println("Enter the ItemCode");
			    item_code=scanner.nextInt();
				System.out.println("Enter the ItemName");
				name=scanner.next();
				System.out.println("Enter the  unit price");
				price=scanner.nextInt();
				System.out.println("Enter the Size");
				String size=scanner.next();
				System.out.println("Enter the material");
				String material=scanner.next();
				System.out.println("Enter the Quantity");
				quantity=scanner.nextInt();
				Apparel apparel=new Apparel(item_code,name,price,quantity,size,material);
				Apparel apparel1=service.storeApparel(apparel);
				break;
			case 3:
				System.out.println("Enter the ItemCode");
			    item_code=scanner.nextInt();
				System.out.println("Enter the ItemName");
				name=scanner.next();
				System.out.println("Enter the  unit price");
				price=scanner.nextInt();
				System.out.println("Enter the DateofManufacture");
				String date_manufacture=scanner.next();
				System.out.println("Enter the DateofExpiry");
				String date_expiry=scanner.next();
				System.out.println("Enter the Vegetarian");
				String veg=scanner.next();
				System.out.println("Enter the Quantity");
				quantity=scanner.nextInt();
				
				FoodItems food=new FoodItems(item_code,name,price,quantity,date_manufacture,date_expiry,veg);
				FoodItems food1=service.storeFood(food);
				break;
				
			case 4:
				ArrayList<Electronics> electronics2;
				try {
					electronics2 = service. getTop3Electronics();
					int token=1;
					for(Electronics temp:electronics2)
					{
						if(token<4)
						{
							System.out.println(temp);
							token++;
						}
						
					}
				} catch (ItemsAreNotFound e) {
					
					System.out.println(e.getMessage());
				}
				break;
			case 5:
				try
				{
				    ArrayList<Apparel> apparel2 =service. getTop3Apparel();
			       int tok1=1;
				    for(Apparel temp:apparel2)
				   {
					     if(tok1<4)
					    {
						   System.out.println(temp);
						   tok1++;
					    }
					
				   }
				}
                catch (ItemsAreNotFound e) {
					
					System.out.println(e.getMessage());
				}
				break;
			case 6:
				try
				{
				   ArrayList<FoodItems> food2 =service. getTop3AFoodItems();
				    int tok2=1;
				    for(FoodItems temp:food2)
				    {
					    if(tok2<4)
					   {
						 System.out.println(temp);
						 tok2++;
					   }
					
				    }
				}
                catch (ItemsAreNotFound e) {
					
					System.out.println(e.getMessage());
				}
				break;

        }
		}while(option!=7);
	}
}
