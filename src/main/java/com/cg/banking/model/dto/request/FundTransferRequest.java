package com.cg.banking.model.dto.request;

import java.math.BigDecimal;

import lombok.Data;
@Data
public class FundTransferRequest {
	private String fromAccount;
    private String toAccount;
    private BigDecimal amount;
    
    
	public FundTransferRequest(String fromAccount, String toAccount, BigDecimal amount) {
		super();
		this.fromAccount = fromAccount;
		this.toAccount = toAccount;
		this.amount = amount;
	}
	public String getFromAccount() {
		return fromAccount;
	}
	public void setFromAccount(String fromAccount) {
		this.fromAccount = fromAccount;
	}
	public String getToAccount() {
		return toAccount;
	}
	public void setToAccount(String toAccount) {
		this.toAccount = toAccount;
	}
	public BigDecimal getAmount() {
		return amount;
	}
	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}
    
}

