package com.cg.banking.entities;

import java.util.List;

import com.cg.banking.model.dto.Account;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "banking_core_Customer")
public class CustomerEntity {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

	private String name;
	@OneToMany(mappedBy = "user",fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<AccountEntity> accounts;
	private String Address;
	private Long phoneNum;
	private String email;
	private List<Account> Accounts;
	@ManyToOne
    @JoinColumn(name = "customer_id")
	
	
	private CustomerEntity customer;
	public CustomerEntity() { }
	 public CustomerEntity(Long id, String name, List<AccountEntity> accounts, String address, Long phoneNum,
			String email, List<Account> accounts2, CustomerEntity customer) {
		super();
		this.id = id;
		this.name = name;
		this.accounts = accounts;
		Address = address;
		this.phoneNum = phoneNum;
		this.email = email;
		Accounts = accounts2;
		this.customer = customer;
	
		
	}
	@Override
	public String toString() {
		return "CustomerEntity [id=" + id + ", name=" + name + ", accounts=" + accounts + ", Address=" + Address
				+ ", phoneNum=" + phoneNum + ", email=" + email + ", Accounts=" + Accounts + ", customer=" + customer
				+ "]";
	}
}
