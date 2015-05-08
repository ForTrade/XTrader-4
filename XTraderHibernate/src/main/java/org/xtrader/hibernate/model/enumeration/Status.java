package org.xtrader.hibernate.model.enumeration;

/**
 *  Order status
 * @author elmehdi
 *
 */
public enum Status {
	

	CANCELED("CANCELED"),  						// Canceled Order
	EXECUTED("EXECUTED"), 						// Fully Executed Order.
	OPEN("OPEN"),                               // Order is not submitted yet
	PARTIALLY_EXECUTED("PARTIALLY_EXECUTED"),   // Partially executed Order.
	REJECTED("REJECTED"),   					// Order rejected
	SUBMITTED("SUBMITTED"); 					// Order is submitted to and received by the external Broker.
	
	private String value;

	private Status(String value){
		this.value = value;
	}
	
}
