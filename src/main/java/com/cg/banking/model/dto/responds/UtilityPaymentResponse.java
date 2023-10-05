package com.cg.banking.model.dto.responds;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class UtilityPaymentResponse {
	private String message;
    private String transactionId;
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
	public UtilityPaymentResponse(String message, String transactionId) {
		super();
		this.message = message;
		this.transactionId = transactionId;
	}
	public static Object builder() {
		// TODO Auto-generated method stub
		return null;
	}
    
}
