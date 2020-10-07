package br.com.tijo.api.user.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.SerializedName;

@JsonIgnoreProperties(ignoreUnknown = true)
public class UserDto  {
	
	@SerializedName("id")
	@JsonProperty("id")	
	private String id;

	@SerializedName("email")
	@JsonProperty("email")	
	private String email;
	@SerializedName("name")
	@JsonProperty("name")	
	private String name;
	@SerializedName("status")
	@JsonProperty("status")	
	private String status;
	@SerializedName("phone")
	@JsonProperty("phone")	
	private String phone;
	@SerializedName("icon")
	@JsonProperty("icon")	
	private String icon;

	
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getIcon() {
		return icon;
	}
	public void setIcon(String icon) {
		this.icon = icon;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	



}
