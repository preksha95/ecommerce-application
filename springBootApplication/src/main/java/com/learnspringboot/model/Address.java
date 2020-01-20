package com.learnspringboot.model;

public class Address {
	private String address_id;
	public Address(String address_id, String[] addresses, String state, String city, String pincode, String user_id) {
		super();
		this.address_id = address_id;
		this.addresses = addresses;
		this.state = state;
		this.city = city;
		this.pincode = pincode;
		this.user_id = user_id;
	}
	public String getAddress_id() {
		return address_id;
	}
	public void setAddress_id(String address_id) {
		this.address_id = address_id;
	}
	public String[] getAddresses() {
		return addresses;
	}
	public void setAddresses(String[] addresses) {
		this.addresses = addresses;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	private String[] addresses;
	private String state;
	private String city;
	private String pincode;
	private String user_id;
	
}
