package com.cg.banking.model.dto.responds;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
@Builder
@Setter
@Getter
public class FundTransferResponse {
	private String message;
    private String transactionId;
    
	public FundTransferResponse(String message, String transactionId) {
		super();
		this.message = message;
		this.transactionId = transactionId;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

	public static Object builder() {
		// TODO Auto-generated method stub
		return null;
	}
}
