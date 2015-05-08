package org.xtrader.hibernate.model.enumeration;

public enum Direction {
	
	FLAT(0), 
	LONG(1), 
	SHORT(-1);
	
	private int value;

	private Direction(int value){
		this.value = value;
	}
}
