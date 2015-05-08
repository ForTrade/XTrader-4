package org.xtrader.hibernate.model.enumeration;

public enum OrderType {
	
	DISTRIBUTIONAL("DISTRIBUTIONAL"),
	LIMIT("LIMIT"), 
	MARKET("MARKET"), 
	SLICING("SLICING"), 
	STOP("STOP"), 
	STOP_LIMIT("STOP_LIMIT"), 
	TICKWISE_INCREMENTAL("TICKWISE_INCREMENTAL"), 
	VARIABLE_INCREMENTAL("VARIABLE_INCREMENTAL"); 
		
	private String value;

	private OrderType(String value){
		this.value = value;
	}
}
