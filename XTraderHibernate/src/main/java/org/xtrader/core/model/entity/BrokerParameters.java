package org.xtrader.core.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Broker_Parameters")
public class BrokerParameters {
	
	@Id
    @GeneratedValue
	private Long id;
	
	private Broker borker;
	
	@Column(name="symbol_root")
	private String symbolRoot;
	
	@Column(name="exchange_vode")
	private String exchangeCode;
	
	@Column(name="execution_commission")
	private float executionCommission;
	
	@Column(name="clearing_commission")
	private float clearingCommission;
	
	@Column(name="fee")
	private float fee;
	
	
	public BrokerParameters(Broker borker, String symbolRoot,
			String exchangeCode, float executionCommission,
			float clearingCommission, float fee) {
		super();
		this.borker = borker;
		this.symbolRoot = symbolRoot;
		this.exchangeCode = exchangeCode;
		this.executionCommission = executionCommission;
		this.clearingCommission = clearingCommission;
		this.fee = fee;
	}

	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Broker getBorker() {
		return borker;
	}

	public void setBorker(Broker borker) {
		this.borker = borker;
	}

	public String getSymbolRoot() {
		return symbolRoot;
	}

	public void setSymbolRoot(String symbolRoot) {
		this.symbolRoot = symbolRoot;
	}

	public String getExchangeCode() {
		return exchangeCode;
	}

	public void setExchangeCode(String exchangeCode) {
		this.exchangeCode = exchangeCode;
	}

	public float getExecutionCommission() {
		return executionCommission;
	}

	public void setExecutionCommission(float executionCommission) {
		this.executionCommission = executionCommission;
	}

	public float getClearingCommission() {
		return clearingCommission;
	}

	public void setClearingCommission(float clearingCommission) {
		this.clearingCommission = clearingCommission;
	}

	public float getFee() {
		return fee;
	}

	public void setFee(float fee) {
		this.fee = fee;
	}
	
	
	
}
