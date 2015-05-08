package org.xtrader.hibernate.model.enumeration;

public enum OrderServiceType {
	
	
	CNX_FIX("CNX_FIX"),  			//("LMAX Fix interface"),
	DC_FIX("DC_FIX"),				//DC_FIX("DukasCopy Fix Interface"),
	FXCM_FIX("FXCM_FIX"),			//FXCM_FIX("FXCM Fix interface"),
	IB_FIX("IB_FIX"),				//IB_FIX("Interactive Brokers Fix Interface"),
	IB_NATIVE("IB_NATIVE"),			//IB_NATIVE("Interactive Brokers Native Interface"),
	JPM_FIX("JPM_FIX"),				//JPM_FIX("J.P.Morgan Fix Interface"),
	LMAX_FIX("LMAX_FIX"),			//LMAX_FIX("LMAX Fix interface"),
	RT_FIX("RT_FIX"),				//RT_FIX("RealTick Fix interface"),
	SIMULATION("SIMULATION");		//SIMULATION("SIMULATION");
	
	
	
	private String value;

	private OrderServiceType(String value){
		this.value = value;
	}
}
