package org.xtrader.hibernate.model.enumeration;

public enum Side {
	
	BUY("BUY"),
	SELL("SELL"), 
	SELL_SHORT("SELL_SHORT"); // Represent Short Selling of a Stock.
	
	private String value;

	private Side(String value){
		this.value = value;
	}
}
