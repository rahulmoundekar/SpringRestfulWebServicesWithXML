package com.app.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.app.bean.Country;
import com.app.bean.CountryList;

@RestController
public class CountryController {

	@RequestMapping(value = "/countries", method = RequestMethod.GET, headers = "Accept=application/xml")
	public CountryList getCountries() {
		CountryList countryList = createCountryList();
		return countryList;
	}

	@RequestMapping(value = "/country/{id}", method = RequestMethod.GET)
	public Country getCountryById(@PathVariable int id) {
		List<Country> listOfCountries = new ArrayList<Country>();
		CountryList countryList = createCountryList();
		listOfCountries = countryList.getListOfCountries();
		for (Country country : listOfCountries) {
			if (country.getId() == id)
				return country;
		}

		return null;
	}

	public CountryList createCountryList() {
		Country indiaCountry = new Country(1, "India");
		Country southCountry = new Country(4, "South Africa");
		Country usaCountry = new Country(3, "USA");
		Country shrilankaCountry = new Country(2, "ShriLanka");

		List<Country> listOfCountries = new ArrayList<Country>();
		listOfCountries.add(indiaCountry);
		listOfCountries.add(southCountry);
		listOfCountries.add(usaCountry);
		listOfCountries.add(shrilankaCountry);
		return new CountryList(listOfCountries);
	}
}
