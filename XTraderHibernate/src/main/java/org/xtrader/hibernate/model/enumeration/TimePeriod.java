package org.xtrader.hibernate.model.enumeration;

public enum TimePeriod {
	
	DAY("DAY"), 
	HOUR("HOUR"), 
	MIN("MIN"), 
	MONTH("MONTH"), 
	MSEC("MSEC"), 
	SEC("SEC"), 
	WEEK("WEEK"), 
	YEAR("YEAR");
	
	private String value;

	private TimePeriod(String value){
		this.value = value;
	}
}
