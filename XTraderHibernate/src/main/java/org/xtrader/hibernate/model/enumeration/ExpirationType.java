package org.xtrader.hibernate.model.enumeration;

public enum ExpirationType {
	NEXT_3_RD_FRIDAY("NEXT_3_RD_FRIDAY"),   //Expires on the 3rd Friday every Month."),
	NEXT_3_RD_FRIDAY_3_MONTHS("NEXT_3_RD_FRIDAY_3_MONTHS"),  //Expires on the 3rd Friday in the 3-month Cycle (March, June, Sept and December)"),
	NEXT_3_RD_MONDAY_3_MONTHS("NEXT_3_RD_MONDAY_3_MONTHS"),  //Expires on the 3rd Monday in the 3-month Cycle (March, June, Sept and December)"),
	THIRTY_DAYS_BEFORE_NEXT_3_RD_FRIDAY("THIRTY_DAYS_BEFORE_NEXT_3_RD_FRIDAY");  //Expires 30 days before the 3rd Friday every Month.");
	
	
	private String value;

	private ExpirationType(String value){
		this.value = value;
	}
}
