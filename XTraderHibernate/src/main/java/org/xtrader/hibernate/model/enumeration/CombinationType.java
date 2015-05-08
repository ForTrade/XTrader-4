package org.xtrader.hibernate.model.enumeration;

public enum CombinationType {
	
	BUTTERFLY("BUTTERFLY"),
	CALENDAR_SPREAD("CALENDAR_SPREAD"), 
	RATIO_SPREAD("RATIO_SPREAD"),
	STRADDLE("STRADDLE"), 
	STRANGLE("STRANGLE") ,
	VERTICAL_SPREAD("VERTICAL_SPREAD"); 
	
	private String value;

	private CombinationType(String value){
		this.value = value;
	}
}
