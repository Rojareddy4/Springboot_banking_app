package com.cg.banking.service;

import java.math.BigDecimal;
import java.util.UUID;

import com.cg.banking.entities.AccountEntity;
import com.cg.banking.entities.TransactionEntity;
import com.cg.banking.model.TransactionType;
import com.cg.banking.model.dto.Account;
import com.cg.banking.model.dto.UtilityAccount;
import com.cg.banking.model.dto.request.FundTransferRequest;
import com.cg.banking.model.dto.request.UtilityPaymentRequest;
import com.cg.banking.model.dto.responds.FundTransferResponse;
import com.cg.banking.model.dto.responds.UtilityPaymentResponse;
import com.cg.banking.repositories.AccountRepository;
import com.cg.banking.repositories.TransactionRepository;

public class TransactionService {
	private final AccountService accountService = new AccountService();
    private final AccountRepository AccountRepository = null;
    private final TransactionRepository transactionRepository = null;

    public FundTransferResponse fundTransfer(FundTransferRequest fundTransferRequest) {

        Account fromBankAccount = accountService.readBankAccount(fundTransferRequest.getFromAccount());
        Account toBankAccount = accountService.readBankAccount(fundTransferRequest.getToAccount());

        //validating account balances
        validateBalance(fromBankAccount, fundTransferRequest.getAmount());

        String transactionId = internalFundTransfer(fromBankAccount, toBankAccount, fundTransferRequest.getAmount());
        return FundTransferResponse.builder().message("Transaction successfully completed").transactionId(transactionId).build();

    }

    private String internalFundTransfer(Account fromBankAccount, Account toBankAccount, BigDecimal amount) {
		// TODO Auto-generated method stub
		return null;
	}

	private void validateBalance(Account fromBankAccount, BigDecimal amount) {
		// TODO Auto-generated method stub
		
	}

	public String utilPayment(UtilityPaymentRequest utilityPaymentRequest) {

        String transactionId = UUID.randomUUID().toString();
        Account fromBankAccount = accountService.readBankAccount(utilityPaymentRequest.getAccount());

        //validating account balances
        validateBalance(fromBankAccount, utilityPaymentRequest.getAmount());

        UtilityAccount utilityAccount = accountService.readUtilityAccount(utilityPaymentRequest.getProviderId());

        AccountEntity fromAccount = AccountRepository.findByNumber(fromBankAccount.getNumber()).get();

        //we can call third party API to process UTIL payment from payment provider from here.

        fromAccount.setActualBalance(fromAccount.getActualBalance().subtract(utilityPaymentRequest.getAmount()));
        fromAccount.setAvailableBalance(fromAccount.getActualBalance().subtract(utilityPaymentRequest.getAmount()));

        transactionRepository.save(TransactionEntity.builder().transactionType(TransactionType.UTILITY_PAYMENT)
                .account(fromAccount)
                .transactionId(transactionId)
                .referenceNumber(utilityPaymentRequest.getReferenceNumber())
                .amount(utilityPaymentRequest.getAmount().negate()).build());

        return UtilityPaymentResponse.builder().message("Utility payment successfully completed")
                .transactionId(transactionId).build();
        Account fromAccount1 = accountService.readBankAccount(utilityPaymentRequest.getAccount());

        //validating account balances
        validateBalance(fromBankAccount, utilityPaymentRequest.getAmount());

        UtilityAccount utilityAccount1 = accountService.readUtilityAccount(utilityPaymentRequest.getProviderId());

        AccountEntity fromAccount11 = AccountRepository.findByNumber(fromBankAccount.getNumber()).get();

        //we can call third party API to process UTIL payment from payment provider from here.

        fromAccount11.setActualBalance(fromAccount11.getActualBalance().subtract(utilityPaymentRequest.getAmount()));
        fromAccount11.setAvailableBalance(fromAccount11.getActualBalance().subtract(utilityPaymentRequest.getAmount()));

        transactionRepository.save(TransactionEntity.builder().transactionType(TransactionType.UTILITY_PAYMENT)
                .account(fromAccount11)
                .transactionId(transactionId)
                .referenceNumber(utilityPaymentRequest.getReferenceNumber())
                .amount(utilityPaymentRequest.getAmount().negate()).build());

        return UtilityPaymentResponse.builder().message("Utility payment successfully completed")
                .transactionId(transactionId).build();
        //.transactionId(transactionId)
        //.account(fromBankAccountEntity).amount(amount.negate()).build());

Object toAccountEntity;
Object amount;
//toAccountEntity.setActualBalance(toAccountEntity.getActualBalance().add(amount));
//toAccountEntity.setAvailableBalance(toAccountEntity.getActualBalance().add(amount));
AccountRepository.save(toAccountEntity);

transactionRepository.save(((Object) TransactionEntity.builder()).transactionType(TransactionType.FUND_TRANSFER)
        .referenceNumber(((Account) toAccountEntity).getNumber())
        .transactionId(transactionId)
        .account(toAccountEntity).amount(amount).build());

return transactionId;

}

}

