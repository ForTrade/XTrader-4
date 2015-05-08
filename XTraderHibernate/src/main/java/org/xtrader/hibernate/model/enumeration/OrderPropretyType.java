package org.xtrader.hibernate.model.enumeration;

public enum OrderPropretyType {
	
	FIX("FIX"),   //will be added as a Fix tag",
	IB("IB"),      //will be added as a custom IB tag",
	INTERNAL("INTERNAL");  //will not be added to outgoing order messages";
	
	private String value;

	private OrderPropretyType(String value){
		this.value = value;
	}
}
