package com.cg.banking.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.banking.entities.AccountEntity;

public interface AccountRepository extends JpaRepository<AccountEntity, Long> {
    Optional<AccountEntity> findByNumber(String accountNumber);
	

}
