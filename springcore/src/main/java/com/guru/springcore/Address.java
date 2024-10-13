package com.guru.springcore;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Address {
      @Value("Hyderabad")
	 private String location;
      @Value("India")
	 private String country;
	public String getLocation() {
		return location;
	}
	public Address() {
		System.out.println("Address");
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public Address(String location, String country) {
		super();
		this.location = location;
		this.country = country;
	}
	@Override
	public String toString() {
		return "Address [location=" + location + ", country=" + country + "]";
	}
	 
}
