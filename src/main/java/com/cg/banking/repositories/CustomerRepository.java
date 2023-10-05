package com.cg.banking.repositories;

import java.util.Optional;

import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.banking.entities.CustomerEntity;

public interface CustomerRepository extends JpaRepository<CustomerEntity, Long>{
    Optional<CustomerEntity> findByIdentificationNumber(String identificationNumber);

	Object findAll(Pageable pageable);

}
