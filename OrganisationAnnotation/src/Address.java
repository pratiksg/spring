package com.capgemini.spring.service;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.Component;

@Component
public class Address {
	@Value("Maharashtra")
	private String state;
	@Value("India")
	private String country;
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	@Override
	public String toString() {
		return "Address [state=" + state + ", country=" + country + "]";
	}
	
}