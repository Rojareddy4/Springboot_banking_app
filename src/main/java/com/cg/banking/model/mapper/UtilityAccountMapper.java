package com.cg.banking.model.mapper;

import org.springframework.beans.BeanUtils;

import com.cg.banking.entities.AccountEntity;
import com.cg.banking.model.dto.UtilityAccount;

public class UtilityAccountMapper extends BaseMapper<UtilityAccount, UtilityAccount> {
    @Override
    public UtilityAccount convertToEntity(UtilityAccount dto, Object... args) {
        UtilityAccount entity = new UtilityAccount();
        if (dto != null) {
            BeanUtils.copyProperties(dto, entity);
        }
        return entity;
    }

    @Override
    public UtilityAccount convertToDto(UtilityAccount entity, Object... args) {
        UtilityAccount dto = new UtilityAccount();
        if (entity != null) {
            BeanUtils.copyProperties(entity, dto);
        }
        return dto;
    }

	public UtilityAccount convertToDto(AccountEntity accountEntity) {
		// TODO Auto-generated method stub
		return null;
	}
}


