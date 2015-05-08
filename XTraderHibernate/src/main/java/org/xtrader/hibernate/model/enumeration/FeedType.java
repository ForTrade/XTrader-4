package org.xtrader.hibernate.model.enumeration;

public enum FeedType {
	
	BB("BB"),  		//BloomBerg,
	CNX("CNX"),
	DC("DC"),   	//DukasCopy,
	FXCM("FXCM"),
	IB("IB"),       //Interactive Brokers",
	LMAX("LMAX"),
	SIM("SIM");  	//Simulation";
	
	private String value;

	private FeedType(String value){
		this.value = value;
	}
}
