package com.example.ujianspringboot1.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.ujianspringboot1.entity.CompanyBudget;

@Repository
public interface CompanyBudgetRepository extends JpaRepository<CompanyBudget, Integer> {
	
	@Query(value = "SELECT * FROM company_budget WHERE company_budget_amount > 5000000", nativeQuery = true)
	List<CompanyBudget> findCompanyBudgetAmountAbove();
	
	@Query(value = "SELECT * FROM company_budget WHERE company_budget_amount < 0", nativeQuery = true)
	List<CompanyBudget> findCompanyBudgetAmountMinus();
}
