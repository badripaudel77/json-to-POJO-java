package com.spring.badri.json.demo;

//this is the class for the address as adrress is nested in json file
public class Address {

	private String street;
	private String city;
	private String state;
	private String zip;
	private String country;
	
	//use the address for data/sample-full.json
	public Address() {
		
	}

	
	//jackson calls getters and setters so we need them

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
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

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
	
	
	
}
