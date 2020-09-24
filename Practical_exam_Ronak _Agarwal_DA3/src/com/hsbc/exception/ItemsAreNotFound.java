package com.hsbc.exception;

public class ItemsAreNotFound extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public ItemsAreNotFound()
	{
		super("Items are less than 3, Put more items");
	}
	public ItemsAreNotFound(String msg)
	{
		super(msg);
	}

}
