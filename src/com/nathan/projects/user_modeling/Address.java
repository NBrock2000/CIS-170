package com.nathan.projects.user_modeling;

import java.util.ArrayList;
import java.util.List;

public class Address {

	private String street;
	private String city;
	private String state;
	private String zipcode;
	
	List<String> address = new ArrayList<String>();
	public void addAddress() {
		if(address.isEmpty()) {
			address.add(street);
			address.add(city);
			address.add(state);
			address.add(zipcode);
		} else {
			for(int i = 0; i < address.size(); i++) {
				address.remove(i);
			}
			address.add(street);
			address.add(city);
			address.add(state);
			address.add(zipcode);
		}
	}
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
	public String getZipcode() {
		return zipcode;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
}
