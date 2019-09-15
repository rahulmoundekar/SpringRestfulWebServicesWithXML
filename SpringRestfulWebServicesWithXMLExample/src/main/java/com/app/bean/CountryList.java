package com.app.bean;

import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "country-list")
public class CountryList {

	List<Country> listOfCountries;
	
	public CountryList() {
		super();
	}
	public CountryList(List<Country> listOfCountries) {
		this.listOfCountries=listOfCountries;
	}
	public List<Country> getListOfCountries() {
		return listOfCountries;
	}
	
	@XmlElement(name = "country")
	public void setListOfCountries(List<Country> listOfCountries) {
		this.listOfCountries = listOfCountries;
	}

}
