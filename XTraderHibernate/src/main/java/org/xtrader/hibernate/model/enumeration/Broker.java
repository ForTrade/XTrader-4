package org.xtrader.hibernate.model.enumeration;

public enum Broker {
	
	CNX("CNX") , 
	DC("DC"),     // DukasCopy
	FXCM("FXCM"), 
	IB("IB"),     // InteractiveBrokers
	JPM("JPM"),   // J.P.Morgan
	LMAX("LMAX"), 
	RBS("RBS"),   // Royal Bank of Scotland
	RT("RT");     // RealTick
	
	private String value;

	private Broker(String value){
		this.value = value;
	}
	
	
}
