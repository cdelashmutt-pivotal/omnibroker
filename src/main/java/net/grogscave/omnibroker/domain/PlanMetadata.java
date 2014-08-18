package net.grogscave.omnibroker.domain;

public class PlanMetadata {

	String name;
	String description;
	String bullets[];
	PlanCost costs[];
	String displayName;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String[] getBullets() {
		return bullets;
	}
	public void setBullets(String[] bullets) {
		this.bullets = bullets;
	}
	public PlanCost[] getCosts() {
		return costs;
	}
	public void setCosts(PlanCost[] costs) {
		this.costs = costs;
	}
	public String getDisplayName() {
		return displayName;
	}
	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}
	
}
