package com.example.kafka.RatesApp.model;

import java.util.List;

public class FxMessage {

	private int total;
	private List<ValuationRate> valuationRate;
	
	public FxMessage() {
		super();
	}
	public FxMessage(int total, List<ValuationRate> valuationRate) {
		super();
		this.total = total;
		this.valuationRate = valuationRate;
	}
	@Override
	public String toString() {
		return "ValuationData [total=" + total + ", valuationRate=" + valuationRate + "]";
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public List<ValuationRate> getValuationRate() {
		return valuationRate;
	}
	public void setValuationRate(List<ValuationRate> valuationRate) {
		this.valuationRate = valuationRate;
	}

}
