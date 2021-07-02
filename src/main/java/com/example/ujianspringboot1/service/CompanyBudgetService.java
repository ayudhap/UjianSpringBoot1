package com.example.ujianspringboot1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ujianspringboot1.entity.CompanyBudget;
import com.example.ujianspringboot1.repository.CompanyBudgetRepository;

@Service
public class CompanyBudgetService {

	@Autowired
	private CompanyBudgetRepository budgetRepository;
	
	public CompanyBudget saveCompanyBudget(CompanyBudget companyBudget) {
		return budgetRepository.save(companyBudget);
	}
	
	public List<CompanyBudget> saveCompanyBudgets(List<CompanyBudget> companyBudgets) {
		return budgetRepository.saveAll(companyBudgets);
	}
	
	public List<CompanyBudget> findCompanyBudgetAmountAbove() {
		return budgetRepository.findCompanyBudgetAmountAbove();
	}
	
	public List<CompanyBudget> getCompanyBudgetAmountMinus() {
		return budgetRepository.findCompanyBudgetAmountMinus();
	}
}
