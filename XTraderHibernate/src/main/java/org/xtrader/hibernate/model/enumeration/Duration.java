package org.xtrader.hibernate.model.enumeration;

public enum Duration {
	
	DAY_1("DAY_1"),
	DAY_2("DAY_2"),
	HOUR_1("HOUR_1"),
	HOUR_2("HOUR_2"),
	MIN_1("MIN_1"),
	MIN_15("MIN_15"),
	MIN_2("MIN_2"),
	MIN_30("MIN_30"),
	MIN_5("MIN_5"),
	MONTH_1("MONTH_1"),
	MONTH_10("MONTH_10"),
	MONTH_11("MONTH_11"),
	MONTH_18("MONTH_18"),
	MONTH_2("MONTH_2"),
	MONTH_3("MONTH_3"),
	MONTH_4("MONTH_4"),
	MONTH_5("MONTH_5"),
	MONTH_6("MONTH_6"),
	MONTH_7("MONTH_7"),
	MONTH_8("MONTH_8"),
	MONTH_9("MONTH_9"),
	MSEC_1("MSEC_1"),
	SEC_1("SEC_1"),
	WEEK_1("WEEK_1"),
	WEEK_2("WEEK_2"),
	YEAR_1("YEAR_1"),
	YEAR_2("YEAR_2");
	
	private String value;

	private Duration(String value){
		this.value = value;
	}
}
