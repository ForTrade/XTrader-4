package org.xtrader.hibernate.model.enumeration;

public enum TickType {
	
	CLOSE("CLOSE"), 
	HIGH("HIGH"), 
	IMBALANCE("IMBALANCE"), 
	LOW("LOW"), 
	OPEN("OPEN"), 
	OPEN_INTEREST("OPEN_INTEREST");
	
	private String value;

	private TickType(String value){
		this.value = value;
	}
	
}
