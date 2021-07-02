package com.example.ujianspringboot1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ujianspringboot1.entity.Transaction;
import com.example.ujianspringboot1.repository.TransactionRepository;

@Service
public class TransactionService {
	
	@Autowired
	private TransactionRepository transactionRepository;
	
	public Transaction saveTransaction(Transaction transaction) {
		return transactionRepository.save(transaction);
	}
	
	public List<Transaction> saveTransactions(List<Transaction> transaction) {
		return transactionRepository.saveAll(transaction);
	}
	
	public List<Transaction> findByTransactionTypeR() {
		return transactionRepository.findByTransactionTypeR();
	}
	
	public List<Transaction> findByTransactionTypeS() {
		return transactionRepository.findByTransactionTypeS();
	}
	
}
