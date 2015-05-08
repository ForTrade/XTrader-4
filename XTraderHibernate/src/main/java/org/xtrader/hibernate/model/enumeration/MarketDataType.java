package org.xtrader.hibernate.model.enumeration;

public enum MarketDataType {
	
	BAR("BAR"), TICK("TICK");
	
	private String value;

	private MarketDataType(String value){
		this.value = value;
	}
}
