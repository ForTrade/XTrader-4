package org.xtrader.hibernate.model.enumeration;

public enum TransactionType {
	
	BUY("BUY"),	 							//
	CREDIT("CREDIT"),						//
	DEBIT("DEBIT"),							//
	DIVIDEND("DIVIDEND"),					//
	EXPIRATION("EXPIRATION"),				//
	FEES("FEES"),							//
	INTREST_PAID("INTREST_PAID"),			//
	INTREST_RECEIVED("INTREST_RECEIVED"),	//
	REBALANCE("REBALANCE"),					//
	REFUND("REFUND"),						//
	SELL("SELL"),	 						//
	TRANSFER("TRANSFER");					//

	private String value;

	private TransactionType(String value){
		this.value = value;
	}
	
}
