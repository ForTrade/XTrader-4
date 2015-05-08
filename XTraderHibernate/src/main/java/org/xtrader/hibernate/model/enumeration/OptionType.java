package org.xtrader.hibernate.model.enumeration;

public enum OptionType {
	
	CALL("CALL"),PUT("PUT");
	
	private String value;

	private OptionType(String value){
		this.value = value;
	}
}
