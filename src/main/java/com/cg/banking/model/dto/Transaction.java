package com.cg.banking.model.dto;

import java.math.BigDecimal;

import com.cg.banking.entities.AccountEntity;

public class Transaction {
	private Long id;
    private BigDecimal amount;
    private AccountEntity Account;
    private String referenceNumber;

}
