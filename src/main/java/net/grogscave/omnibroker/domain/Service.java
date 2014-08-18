package net.grogscave.omnibroker.domain;

public class Service {

	String id;
	String name;
	String description;
	boolean bindable;
	String tags[];
	ServiceMetadata metadata;
	String requires[];
	Plan plans[];
	DashboardClient dashboard_client;

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
	public boolean isBindable() {
		return bindable;
	}
	public void setBindable(boolean bindable) {
		this.bindable = bindable;
	}
	public String[] getTags() {
		return tags;
	}
	public void setTags(String[] tags) {
		this.tags = tags;
	}
	public ServiceMetadata getMetadata() {
		return metadata;
	}
	public void setMetadata(ServiceMetadata metadata) {
		this.metadata = metadata;
	}
	public String[] getRequires() {
		return requires;
	}
	public void setRequires(String[] requires) {
		this.requires = requires;
	}
	public Plan[] getPlans() {
		return plans;
	}
	public void setPlans(Plan[] plans) {
		this.plans = plans;
	}
	public DashboardClient getDashboard_client() {
		return dashboard_client;
	}
	public void setDashboard_client(DashboardClient dashboard_client) {
		this.dashboard_client = dashboard_client;
	}
	
}
