package com.cg.banking.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.banking.entities.TransactionEntity;

public interface TransactionRepository 
	extends JpaRepository<TransactionEntity, Long> {
}
