package org.xtrader.hibernate.model.enumeration;

public enum InitializingServiceType {
	
	BROKER_INTERFACE("BROKER_INTERFACE"), 
	CORE("CORE");
	
	private String value;

	private InitializingServiceType(String value){
		this.value = value;
	}
}
