package com.example.ujianspringboot1.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "company_budget")
public class CompanyBudget {
	
	@Id
	@GeneratedValue
	private int company_budget_id;
	private int company_id;
	private String company_budget_amount;
	
	public int getCompany_budget_id() {
		return company_budget_id;
	}
	public void setCompany_budget_id(int company_budget_id) {
		this.company_budget_id = company_budget_id;
	}
	public int getCompany_id() {
		return company_id;
	}
	public void setCompany_id(int company_id) {
		this.company_id = company_id;
	}
	public String getCompany_budget_amount() {
		return company_budget_amount;
	}
	public void setCompany_budget_amount(String company_budget_amount) {
		this.company_budget_amount = company_budget_amount;
	}
	
}
