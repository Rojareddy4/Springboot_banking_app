package com.cg.banking.entities;

import java.math.BigDecimal;

import org.springframework.data.annotation.Id;

import com.cg.banking.model.AccountStatus;
import com.cg.banking.model.AccountType;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "banking_core_Account")
public class AccountEntity {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long customer_id;

    private String number;

    @Enumerated(EnumType.STRING)
    private AccountType type;

    @Enumerated(EnumType.STRING)
    private AccountStatus status;

    private BigDecimal availableBalance;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private CustomerEntity user;
    public AccountEntity() { }
	public AccountEntity(Long customer_id, String number, AccountType type, AccountStatus status,
			BigDecimal availableBalance, CustomerEntity user) {
		super();
		this.customer_id = customer_id;
		this.number = number;
		this.type = type;
		this.status = status;
		this.availableBalance = availableBalance;
		this.user = user;
	}
	public BigDecimal getActualBalance() {
		// TODO Auto-generated method stub
		return null;
	}
	public void setActualBalance(BigDecimal subtract) {
		// TODO Auto-generated method stub
		
	}
	public void setAvailableBalance(BigDecimal subtract) {
		// TODO Auto-generated method stub
		
	}

    
}
