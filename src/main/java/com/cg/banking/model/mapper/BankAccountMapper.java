package com.cg.banking.model.mapper;

import org.springframework.beans.BeanUtils;

import com.cg.banking.entities.AccountEntity;
import com.cg.banking.model.dto.Account;

public class BankAccountMapper extends BaseMapper {

    @Override
    public AccountEntity convertToEntity(Account dto, Object ) {
        AccountEntity entity = new AccountEntity();
        if (dto != null) {
            BeanUtils.copyProperties(dto, entity, "customer");
        }
        return entity;
    }

    @Override
    public Account convertToDto(AccountEntity entity, Object ) {
        Account dto = new Account();
        if (entity != null) { 
            BeanUtils.copyProperties(entity, dto, "customer");
        }
        return dto;
    }
