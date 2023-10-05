package com.cg.banking.service;

import java.util.List;

import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.stereotype.Service;

import com.cg.banking.entities.CustomerEntity;
import com.cg.banking.model.dto.Customer;
import com.cg.banking.model.mapper.UserMapper;
import com.cg.banking.repositories.CustomerRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CustomerService {
	private UserMapper userMapper = new UserMapper();

    private final CustomerRepository customerRepository = null;

    public Customer readcustomer(String identification) {
        CustomerEntity userEntity = new CustomerEntity();
        return userMapper.convertToDto(userEntity);
    }

    public List<Customer> readUsers(Pageable pageable) {
       return userMapper.convertToDtoList(customerRepository.findAll(pageable).getContent());
    }

}
