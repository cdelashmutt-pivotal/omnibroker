package net.grogscave.omnibroker.cf;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BindServiceRequest {

	private String planId;
	private String serviceId;
	private String appGUID;
	
	public String getPlanId() {
		return planId;
	}
	
	@JsonProperty("plan_id")
	public void setPlanId(String planId) {
		this.planId = planId;
	}
	public String getServiceId() {
		return serviceId;
	}

	@JsonProperty("service_id")
	public void setServiceId(String serviceId) {
		this.serviceId = serviceId;
	}
	public String getAppGUID() {
		return appGUID;
	}
	@JsonProperty("app_guid")
	public void setAppGUID(String appGUID) {
		this.appGUID = appGUID;
	}
	
	
}
