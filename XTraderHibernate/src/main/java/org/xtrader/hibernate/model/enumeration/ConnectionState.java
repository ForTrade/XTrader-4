package org.xtrader.hibernate.model.enumeration;

public enum ConnectionState {
	
	CONNECTED("CONNECTED"),			//Connection is established.
	DISCONNECTED("DISCONNECTED"),	//No current connection.
	IDLE("IDLE"),					//same as CONNECTED but with market data previously subscribed
	LOGGED_ON("LOGGED_ON"),			//Connection established and Session is logged on.
	SUBSCRIBED("SUBSCRIBED");		//Connection is established, Session is logged on and market data is subscribed.
	
	
	private String value;

	private ConnectionState(String value){
		this.value = value;
	}
	
}
