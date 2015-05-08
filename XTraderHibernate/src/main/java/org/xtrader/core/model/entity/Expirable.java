package org.xtrader.core.model.entity;


public interface Expirable {
	
	/**
	 * returns expiration date
	 * @return
	 */
	long getTimeToExpiration();
	
	/**
	 * returns duration
	 * @return
	 */
	int getDuration();
}
