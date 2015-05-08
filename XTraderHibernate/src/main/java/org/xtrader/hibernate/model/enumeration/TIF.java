package org.xtrader.hibernate.model.enumeration;

/**
 * The Time-In-Force of an Order.
 * @author elmehdi
 *
 */
public enum TIF {
	
	ATC("ATC"),  // At-the-Close
	ATO("ATO"),  // At-the-Opening
	DAY("DAY"),  // Day Order
	FOK("FOK"),  // Fill-or-Kill
	GTC("GTC"),  // Good-till-cancel
	GTD("GTD"),  // Good-till-Day
	IOC("IOC");  // Immediate-or-Cancel
	
	private String value;

	private TIF(String value){
		this.value = value;
	}
	
}
