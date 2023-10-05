package com.cg.banking.model.mapper;

import java.util.List;

import org.springframework.beans.BeanUtils;

import com.cg.banking.entities.CustomerEntity;
import com.cg.banking.model.dto.Customer;

public class UserMapper extends BaseMapper<CustomerEntity, Customer>{
    private BankAccountMapper bankAccountMapper = new BankAccountMapper();

    @Override
    public CustomerEntity convertToEntity(Customer dto, Object args) {
        CustomerEntity entity = new CustomerEntity();
        if (dto != null) {
            BeanUtils.copyProperties(dto, entity, "accounts");
            entity.setAccounts(bankAccountMapper.convertToEntityList(dto.getBankAccounts()));
        }
        return entity;
    }

    @Override
    public Customer convertToDto(CustomerEntity entity) {
        Customer dto = new Customer();
        if (entity != null) {
            BeanUtils.copyProperties(entity, dto, "accounts");
            dto.setBankAccounts(bankAccountMapper.convertToDtoList(entity.getAccounts()));{
            }
            return dto;
        }
    }

	public List<Customer> convertToDtoList(Object findAll) {
		// TODO Auto-generated method stub
		return null;
	}


}
