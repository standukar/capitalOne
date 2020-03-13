package com.rab3.dtos;

public class CustomerDto {

	private String Uuid;
	private String name;
	private String email;
	private String address;
	public String getUuid() {
		return Uuid;
	}
	public void setUuid(String uuid) {
		Uuid = uuid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "CustomerDto [Uuid=" + Uuid + ", name=" + name + ", email=" + email + ", address=" + address + "]";
	}
	
	
}
