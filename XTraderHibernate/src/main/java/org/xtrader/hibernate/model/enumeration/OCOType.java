package org.xtrader.hibernate.model.enumeration;

/**
 * 
 * @author elmehdi
 * the One-Cancels-Other Type of an Order Group
 */
public enum OCOType {
	
	CANCEL_OTHERS("CANCEL_OTHERS"),     //One Fill cancels all other Orders,
	NONE("NONE"),
	REDUCE_OTHERS("REDUCE_OTHERS");     //One Fill reduces the quantity of the other Order");
	
	private String value;

	private OCOType(String value){
		this.value = value;
	}
}

