package com.model;

public class RegistrationModel {
	private String email,name,year,city,mobNo,pass;

	public RegistrationModel(String email,
			String name, String year, String city,
			String mobNo, String pass) {
		super();
		this.email = email;
		this.name = name;
		this.year = year;
		this.city = city;
		this.mobNo = mobNo;
		this.pass = pass;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getMobNo() {
		return mobNo;
	}

	public void setMobNo(String mobNo) {
		this.mobNo = mobNo;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}
	
}
