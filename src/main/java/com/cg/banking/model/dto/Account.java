package com.cg.banking.model.dto;

import java.math.BigDecimal;

import com.cg.banking.model.AccountStatus;
import com.cg.banking.model.AccountType;

public class Account {
	 private Long id;
	    private String number;
	    private AccountType type;
	    private AccountStatus status;
	    private BigDecimal availableBalance;
	  //  private BigDecimal actualBalance;
	    private Customer customer;
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getNumber() {
			return number;
		}
		public void setNumber(String number) {
			this.number = number;
		}
		public AccountType getType() {
			return type;
		}
		public void setType(AccountType type) {
			this.type = type;
		}
		public AccountStatus getStatus() {
			return status;
		}
		public void setStatus(AccountStatus status) {
			this.status = status;
		}
		public BigDecimal getAvailableBalance() {
			return availableBalance;
		}
		public void setAvailableBalance(BigDecimal availableBalance) {
			this.availableBalance = availableBalance;
		}
		public Customer getCustomer() {
			return customer;
		}
		public void setCustomer(Customer customer) {
			this.customer = customer;
		}
		public Account(Long id, String number, AccountType type, AccountStatus status, BigDecimal availableBalance,
				Customer customer) {
			super();
			this.id = id;
			this.number = number;
			this.type = type;
			this.status = status;
			this.availableBalance = availableBalance;
			this.customer = customer;
		}
		@Override
		public String toString() {
			return "Account [id=" + id + ", number=" + number + ", type=" + type + ", status=" + status
					+ ", availableBalance=" + availableBalance + ", customer=" + customer + "]";
		}
	    

}
