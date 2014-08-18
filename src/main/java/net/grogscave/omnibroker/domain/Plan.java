package net.grogscave.omnibroker.domain;

public class Plan {

	String id;
	String name;
	String description;
	PlanMetadata metadata;
	boolean free;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
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
	public PlanMetadata getMetadata() {
		return metadata;
	}
	public void setMetadata(PlanMetadata metadata) {
		this.metadata = metadata;
	}
	public boolean isFree() {
		return free;
	}
	public void setFree(boolean free) {
		this.free = free;
	}
	
}
