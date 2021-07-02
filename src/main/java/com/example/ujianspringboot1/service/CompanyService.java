package com.example.ujianspringboot1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ujianspringboot1.entity.Company;
import com.example.ujianspringboot1.repository.CompanyRepository;

@Service
public class CompanyService {

	@Autowired
	private CompanyRepository companyRepository;
	
	public Company saveCompany(Company company) {
		return companyRepository.save(company);
	}
	
	public List<Company> saveCompanies(List<Company> companies) {
		return companyRepository.saveAll(companies);
	}
	
	public List<Company> findCompanyByAddress(String company_address) {
		return companyRepository.findCompanyByAddress(company_address);
	}
	
}
