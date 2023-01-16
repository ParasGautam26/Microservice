package com.nagarro.accountmanagementservice.resource;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.nagarro.accountmanagementservice.controllers.AccountController;
import com.nagarro.accountmanagementservice.models.Account;
import com.nagarro.accountmanagementservice.models.Customer;
import com.nagarro.accountmanagementservice.models.Customers;

@RestController
@RequestMapping("/account")
public class AccountResource {
	
	@Autowired
	private RestTemplate restTemplate;
	
	@RequestMapping("/accounts")
    public ArrayList<Account> getCustomers(){
		Customers customers = restTemplate.getForObject("http://customer-management-service/customer/allCustomers",Customers.class); 
		int size = customers.getCustomers().size();
		
		for(int i=0; i<size ;i++) {
			AccountController.accounts.add(new Account(customers.getCustomers().get(i).getName(),customers.getCustomers().get(i).getAccountNo(),0));
		}
		return AccountController.accounts;
    }
}
