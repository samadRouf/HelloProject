package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Country;

@RestController
public class StudentController {

	@GetMapping("/countries")
	public List<Country> getCountries()
	{
		List<Country> countryList =new ArrayList<>();
		countryList.add(new Country("1","India"));
		countryList.add(new Country("2","Pakistan"));
		countryList.add(new Country("3","UAE"));
		countryList.add(new Country("4","KSA"));
		return countryList;
	}
}
