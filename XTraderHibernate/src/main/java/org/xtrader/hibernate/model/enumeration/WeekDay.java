package org.xtrader.hibernate.model.enumeration;

public enum WeekDay {
	
	FRIDAY("FRIDAY"), 
	MONDAY("MONDAY"), 
	SATURDAY("SATURDAY"), 
	SUNDAY("SUNDAY"), 
	THURSDAY("THURSDAY"), 
	TUESDAY("TUESDAY"), 
	WEDNESDAY("WEDNESDAY");
	
	private String value;

	private WeekDay(String value){
		this.value = value;
	}
	
}
