package org.xtrader.hibernate.model.enumeration;

public enum AssetClass {
	
		COMMODITY("COMMODITY"),
		EQUITY("EQUITY"),
		FIXED_INCOME("FIXED_INCOME"),
		FX("FX"),
		VOLATILITY("VOLATILITY");
		
		private String value;
		
		private AssetClass(String value){
			this.setValue(value);
		}

		public void setValue(String value) {
			this.value = value;
		}

}
