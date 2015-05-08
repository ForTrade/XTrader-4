package org.xtrader.hibernate.model.enumeration;

public enum QuotationStyle {
	
	PRICE("PRICE"),YIELD("YIELD");
	
	private String value;

	private QuotationStyle(String value){
		this.value = value;
	}
}
