package com.example.ujianspringboot1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.ujianspringboot1.entity.CompanyBudget;
import com.example.ujianspringboot1.service.CompanyBudgetService;

@RestController
public class CompanyBudgetController {

	@Autowired
	private CompanyBudgetService budgetService;
	
	@PostMapping("/addCompanyBudget")
	public CompanyBudget addCompanyBudget(@RequestBody CompanyBudget companyBudget) {
		return budgetService.saveCompanyBudget(companyBudget);
	}
	
	@PostMapping("/addCompanyBudgets")
	public List<CompanyBudget> addCompanyBudgets(@RequestBody List<CompanyBudget> companyBudgets) {
		return budgetService.saveCompanyBudgets(companyBudgets);
	}
	
	@GetMapping("/getCompanyBudgetAmountAbove")
	public List<CompanyBudget> findCompanyBudgetAmountAbove() {
		return budgetService.findCompanyBudgetAmountAbove();
	}
	
	@GetMapping("/getCompanyBudgetAmountMinus")
	public List<CompanyBudget> findCompanyBudgetAmountMinus() {
		return budgetService.findCompanyBudgetAmountAbove();
	}
	
}
