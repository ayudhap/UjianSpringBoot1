package com.example.ujianspringboot1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.ujianspringboot1.entity.Company;
import com.example.ujianspringboot1.service.CompanyService;

@RestController
public class CompanyController {

	@Autowired
	private CompanyService companyService;
	
	@PostMapping("/addCompany")
	public Company addCompany(@RequestBody Company company) {
		return companyService.saveCompany(company);
	}
	
	@PostMapping("/addCompanies")
	public List<Company> addCompanies(@RequestBody List<Company> companies) {
		return companyService.saveCompanies(companies);
	}
	
	@GetMapping("/getCompanyByAddress/{company_address}")
	public List<Company> findCompanyByAddress(@PathVariable String company_address) {
		return companyService.findCompanyByAddress(company_address);
	}
	
}
