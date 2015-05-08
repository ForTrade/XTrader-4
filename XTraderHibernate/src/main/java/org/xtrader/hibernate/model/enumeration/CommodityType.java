package org.xtrader.hibernate.model.enumeration;

public enum CommodityType {
	
	AGRICULTURE("AGRICULTURE"), 
	ENERGY ("ENERGY"),
	INDUSTRIAL_METALS("INDUSTRIAL_METALS"), 
	LIVESTOCK("LIVESTOCK"), 
	PRECIOUS_METALS("PRECIOUS_METALS"); 
	
	
	private String value;

	private CommodityType(String value){
		this.value = value;
	}
	
}
