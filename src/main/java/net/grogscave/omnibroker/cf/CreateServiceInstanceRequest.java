/**
 * 
 */
package net.grogscave.omnibroker.cf;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author grog
 *
 */
public class CreateServiceInstanceRequest {

	private String serviceId;
	private String planId;
	private String organizationId;
	private String spaceId;

	public String getServiceId() {
		return serviceId;
	}

	@JsonProperty("service_id")
	public void setServiceId(String serviceId) {
		this.serviceId = serviceId;
	}
	public String getPlanId() {
		return planId;
	}

	@JsonProperty("plan_id")
	public void setPlanId(String planId) {
		this.planId = planId;
	}
	public String getOrganizationId() {
		return organizationId;
	}

	@JsonProperty("organization_id")
	public void setOrganizationId(String organizationId) {
		this.organizationId = organizationId;
	}
	public String getSpaceId() {
		return spaceId;
	}
	@JsonProperty("space_id")
	public void setSpaceId(String spaceId) {
		this.spaceId = spaceId;
	}
}