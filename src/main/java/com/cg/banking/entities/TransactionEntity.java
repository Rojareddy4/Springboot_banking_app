package com.cg.banking.entities;

import java.math.BigDecimal;

import com.cg.banking.model.TransactionType;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
@Builder
@Setter
@Getter
@Entity
@Table
public class TransactionEntity {
	@Id

    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;



    private BigDecimal amount;



    @Enumerated(EnumType.STRING)

    private TransactionType transactionType;



    private String referenceNumber;



    private String transactionId;
    
    @OneToOne(cascade = CascadeType.ALL)

    @JoinColumn(name = "account_id", referencedColumnName = "id")
    private AccountEntity account;
    public TransactionEntity() {}
    
	public TransactionEntity(Long id, BigDecimal amount, TransactionType transactionType, String referenceNumber,
			String transactionId, AccountEntity account) {
		super();
		this.id = id;
		this.amount = amount;
		this.transactionType = transactionType;
		this.referenceNumber = referenceNumber;
		this.transactionId = transactionId;
		this.account = account;
	}

	public static Object builder() {
		// TODO Auto-generated method stub
		return null;
	}
    

}
