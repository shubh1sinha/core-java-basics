package com.assesmentpractice.com;

public class Address {
	protected String flatNo;
	protected String streetName;
	protected String city;
	protected String state;
	protected int pinCode;

	public Address(String flatNo, String streetName, String city, String state, int pinCode) {
		this.flatNo = flatNo;
		this.streetName = streetName;
		this.city = city;
		this.state = state;
		this.pinCode = pinCode;
	}

	public String getFlatNo() {
		return flatNo;
	}

	public void setFlatNo(String flatNo) {
		this.flatNo = flatNo;
	}

	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getPinCode() {
		return pinCode;
	}

	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}

	@Override
	public String toString() {
		return "Address : flatNo=" + flatNo + ", streetName=" + streetName + "\ncity=" + city + ", state=" + state
				+ ", pinCode=" + pinCode;
	}
	
}