package com.cg.banking.model.dto;

import java.util.List;

import com.cg.banking.entities.AccountEntity;

public class Customer {
	private Long id;
    private String Name;
   // private String lastName;
    private String email;
    private String Address;
    private Long phoneNum;
   // private String identificationNumber;
    private List<AccountEntity> Accounts;
	
    public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Long getPhoneNum() {
		return phoneNum;
	}
	public void setPhoneNum(Long phoneNum) {
		this.phoneNum = phoneNum;
	}
	public List<AccountEntity> getAccounts() {
		return Accounts;
	}
	public void setAccounts(List<AccountEntity> accounts) {
		Accounts = accounts;
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", Name=" + Name + ", email=" + email + ", Address=" + Address + ", phoneNum="
				+ phoneNum + ", Accounts=" + Accounts + "]";
	}
	public Customer(Long id, String name, String email, String address, Long phoneNum, List<AccountEntity> accounts) {
		super();
		this.id = id;
		Name = name;
		this.email = email;
		Address = address;
		this.phoneNum = phoneNum;
		Accounts = accounts;
	}
	
	
	
    
}
