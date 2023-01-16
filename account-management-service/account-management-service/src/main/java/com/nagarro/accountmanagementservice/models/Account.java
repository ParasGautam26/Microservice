package com.nagarro.accountmanagementservice.models;

public class Account {
	 private String name;
	 private long accountNo, amount;
	 
	public Account(String name, long accountNo, long amount) {
		this.name = name;
		this.accountNo = accountNo;
		this.amount = amount;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(long accountNo) {
		this.accountNo = accountNo;
	}

	public long getAmount() {
		return amount;
	}

	public void setAmount(long amount) {
		this.amount = amount;
	} 
	}