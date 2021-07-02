package com.example.ujianspringboot1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ujianspringboot1.entity.Transaction;
import com.example.ujianspringboot1.service.TransactionService;

@RestController
public class TransactionController {

	@Autowired
	private TransactionService transactionService;

	@PostMapping("/addTransaction")
	public Transaction addTransaction(Transaction transaction) {
		return transactionService.saveTransaction(transaction);
	}

	@PostMapping("/addTransactions")
	public List<Transaction> addTransactions(List<Transaction> transactions) {
		return transactionService.saveTransactions(transactions);
	}
	
	@GetMapping("/getTransactionTypeR")
	public List<Transaction> findTransactionTypeR() {
		return transactionService.findByTransactionTypeR();
	}
	
	@GetMapping("/getTransactionTypeS")
	public List<Transaction> findTransactionTypeS() {
		return transactionService.findByTransactionTypeS();
	}

}
