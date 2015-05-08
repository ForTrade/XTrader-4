package org.xtrader.hibernate.model.enumeration;

public enum Currency {
	
	AUD("AUD"),
	BRL("BRL"),
	CAD("CAD"),
	CHF("CHF"),
	EUR("EUR"),
	GBP("GBP"),
	HKD("HKD"),
	INR("INR"),
	JPY("JPY"),
	KRW("KRW"),
	NOK("NOK"),
	NZD("NZD"),
	PLN("PLN"),
	RUB("RUB"),
	SEK("SEK"),
	THB("THB"),
	TRY("TRY"),
	TWD("TWD"),
	USD("USD"),
	ZAR("ZAR");
	

	private String value;

	private Currency(String value){
		this.value = value;
	}
}
