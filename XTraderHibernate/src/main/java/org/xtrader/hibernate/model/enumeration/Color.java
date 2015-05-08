package org.xtrader.hibernate.model.enumeration;

public enum Color {
	
	BLACK("BLACK"),
	BLUE("BLUE"), 
	CYAN("CYAN"),
	DARK_GRAY("DARK_GRAY"), 
	GRAY("GRAY") ,
	GREEN("GREEN"), 
	LIGHT_GRAY("LIGHT_GRAY"), 
	MAGENTA("MAGENTA"), 
	ORANGE("ORANGE"), 
	PINK("PINK"), 
	RED("RED"), 
	WHITE("WHITE"), 
	YELLOW("YELLOW"); 

	
	private String value;

	private Color(String value){
		this.value = value;
	}
}
