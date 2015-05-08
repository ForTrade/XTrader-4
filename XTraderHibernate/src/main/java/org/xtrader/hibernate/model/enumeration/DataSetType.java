package org.xtrader.hibernate.model.enumeration;

public enum DataSetType {
		
	OHLC("OHLC"), 
	TIME("OHLC");
	
	private String value;

	private DataSetType(String value){
		this.value = value;
	}
}
