package com.example.ujianspringboot1.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.ujianspringboot1.entity.Transaction;

@Repository
public interface TransactionRepository extends JpaRepository<Transaction, Integer>{

	@Query(value = "Select * FROM transaction WHERE transaction_type = 'r'", nativeQuery = true)
	List<Transaction> findByTransactionTypeR();
	
	@Query(value = "Select * FROM transaction WHERE transaction_type = 's'", nativeQuery = true)
	List<Transaction> findByTransactionTypeS();
	
}
