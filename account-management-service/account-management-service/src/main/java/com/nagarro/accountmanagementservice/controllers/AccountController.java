package com.nagarro.accountmanagementservice.controllers;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nagarro.accountmanagementservice.models.Account;
import com.nagarro.accountmanagementservice.models.Customer;

@Controller
@RequestMapping("/account")
public class AccountController {

	public static ArrayList<Account> accounts = new ArrayList<>();
	
	
	// Add money
	@GetMapping("/add")
	public String add() {
		return "addMoney";
	}
	
	@PostMapping("/addAmount")
    public String addAmount(@ModelAttribute Account account){
		int size = accounts.size();
        for(int i=0; i<size ; i++) {
        	if(accounts.get(i).getAccountNo()==account.getAccountNo()) {
        		Account newAccount = new Account(accounts.get(i).getName(),accounts.get(i).getAccountNo(),accounts.get(i).getAmount()+account.getAmount());
        		accounts.set(i, newAccount);
        	}
        }
        return "addMoney";
    }
	
	// Withdraw money
	@GetMapping("/withdraw")
	public String withdraw() {
		return "withdraw";
	}
	
	@PostMapping("/withdrawAmount")
    public String withdrawAmount(@ModelAttribute Account account){
		int size = accounts.size();
        for(int i=0; i<size ; i++) {
        	if(accounts.get(i).getAccountNo()==account.getAccountNo()) {
        		Account newAccount = new Account(accounts.get(i).getName(),accounts.get(i).getAccountNo(),accounts.get(i).getAmount()-account.getAmount());
        		accounts.set(i, newAccount);
        	}
        }
        return "withdraw";
    }
	
	
	// Delete money
	@GetMapping("/delete")
	public String delete() {
		return "delete";
	}
	
	@GetMapping("/deleteAccount")
    public String deleteAccount(@ModelAttribute Account account){
		int size = accounts.size();
        for(int i=0; i<size ; i++) {
        	if(accounts.get(i).getAccountNo()==account.getAccountNo()) {
        		accounts.remove(i);
        		break;
        	}
        }
        return "delete";
    }
	
	// Get account details
	@GetMapping("/details")
	public String details() {
		return "details";
	}
	
	@GetMapping("/getDetails")
    public String getDetails(@ModelAttribute Account account){
		int size = accounts.size();
        for(int i=0; i<size ; i++) {
        	if(accounts.get(i).getAccountNo()==account.getAccountNo()) {
        		System.out.println("Account found");
        		System.out.println(accounts.get(i).getName());
        	}
        }
        return "details";
    }
}
