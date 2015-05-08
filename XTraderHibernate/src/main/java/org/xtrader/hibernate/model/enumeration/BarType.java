package org.xtrader.hibernate.model.enumeration;

public enum BarType {
	
	ASK("ASK"),
	BEST_ASK("BEST_ASK"),
	BEST_BID("BEST_BID"),
	BID("BID"),
	BID_ASK("BID_ASK"),
	MIDPOINT("MIDPOINT"),
	TRADES("TRADES");
	
	private String value;

	private BarType(String value){
		this.setValue(value);
	}

	public void setValue(String value) {
		this.value = value;
	}
	

}
