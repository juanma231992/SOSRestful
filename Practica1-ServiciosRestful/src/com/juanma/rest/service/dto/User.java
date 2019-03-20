package com.juanma.rest.service.dto;

public class User {
	
	private String id;
	private String name;
	private String surname;
	private int years;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public int getYears() {
		return years;
	}
	public void setYears(int years) {
		this.years = years;
	}

}
