package com.app.bean;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "country")
public class Country {

	@XmlElement(name = "countryId")
	private int id;
	private String countryName;

	public Country() {

	}

	public Country(int i, String countryName) {
		super();
		this.id = i;
		this.countryName = countryName;
	}

	@XmlElement
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@XmlElement
	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
}