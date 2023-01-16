package com.nagarro.accountmanagementservice.models;

public class Customer {
	 	private long customerId, accountNo;
	    private String name, state;
	    private String phoneNo;

	    public Customer(long customerId, long accountNo, String name, String state, String phoneNo) {
	        this.customerId = customerId;
	        this.accountNo = accountNo;
	        this.name = name;
	        this.state = state;
	        this.phoneNo = phoneNo;
	    }

	    public Customer() {
	    }

	    public long getCustomerId() {
	        return customerId;
	    }

	    public void setCustomerId(long customerId) {
	        this.customerId = customerId;
	    }

	    public long getAccountNo() {
	        return accountNo;
	    }

	    public void setAccountNo(long accountNo) {
	        this.accountNo = accountNo;
	    }

	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public String getState() {
	        return state;
	    }

	    public void setState(String state) {
	        this.state = state;
	    }

	    public String getPhoneNo() {
	        return phoneNo;
	    }

	    public void setPhoneNo(String phoneNo) {
	        this.phoneNo = phoneNo;
	    }
}
