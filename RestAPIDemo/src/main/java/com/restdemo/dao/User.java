package com.restdemo.dao;

import javax.inject.Named;

@Named("user")
public class User {
private String name;
private String country;

public User() {}
public User(String name,String country) {
	this.name=name;
	this.country=country;
	}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getCountry() {
	return country;
}
public void setCountry(String country) {
	this.country = country;
}


}
