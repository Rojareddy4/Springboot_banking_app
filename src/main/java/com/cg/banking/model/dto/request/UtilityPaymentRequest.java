package com.cg.banking.model.dto.request;

import java.math.BigDecimal;

import lombok.Data;

@Data
public class UtilityPaymentRequest {
	private Long providerId;
    private BigDecimal amount;
    private String referenceNumber;
    private String account;
	public UtilityPaymentRequest(Long providerId, BigDecimal amount, String referenceNumber, String account) {
		super();
		this.providerId = providerId;
		this.amount = amount;
		this.referenceNumber = referenceNumber;
		this.account = account;
	}
	public Long getProviderId() {
		return providerId;
	}
	public void setProviderId(Long providerId) {
		this.providerId = providerId;
	}
	public BigDecimal getAmount() {
		return amount;
	}
	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}
	public String getReferenceNumber() {
		return referenceNumber;
	}
	public void setReferenceNumber(String referenceNumber) {
		this.referenceNumber = referenceNumber;
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
    
    

}
