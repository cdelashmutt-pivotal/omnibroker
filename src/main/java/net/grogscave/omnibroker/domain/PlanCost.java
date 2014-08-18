package net.grogscave.omnibroker.domain;

public class PlanCost {

	PlanCostAmount amount;
	String unit;
	
	public PlanCostAmount getAmount() {
		return amount;
	}
	public void setAmount(PlanCostAmount amount) {
		this.amount = amount;
	}
	public String getUnit() {
		return unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}
	
}
