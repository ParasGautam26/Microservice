 package com.nagarro.customermanagementservice.controllers;


import com.nagarro.customermanagementservice.models.Customer;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;


@Controller
@RequestMapping("/customer")
public class CustomerController {

    public static ArrayList<Customer> customers = new ArrayList<>();
    
    // To add a customer
    

    @GetMapping("/add")
    public String index(){
        return "index";
    }

    public CustomerController() {
	}

	@PostMapping("/addCustomer")
    public String addCustomer(@ModelAttribute Customer customer){
        customers.add(customer);
        System.out.println("Customer added");
        System.out.println(customers);
        return "index";
    }

    // To delete a customer

    @GetMapping("/delete")
    public String delete(){
        return "delete";
    }

    @PostMapping("/deleteCustomer")
    public String deleteCustomer(@ModelAttribute Customer customer){
        int size = customers.size();
        for(int i=0 ; i<size;i++) {
            if (customers.get(i).getCustomerId() == customer.getCustomerId()) {
                customers.remove(i);
                System.out.println("Customer deleted");
                break;
            }
        }
        return "delete";
    }


    // To update customer details

    @GetMapping("/update")
    public String update(){
        return "update";
    }

    @PostMapping("/updateCustomer")
    public String updateCustomer(@ModelAttribute Customer customer){
        int size = customers.size();
        for(int i=0 ; i<size;i++) {
            if (customers.get(i).getCustomerId() == customer.getCustomerId()) {
                customers.set(i,customer);
                System.out.println("Customer updated");
                break;
            }
        }
        return "update";
    }

    // For single customer details

    @GetMapping("/single")
    public String customer(){
        return "customer";
    }

    @GetMapping("/singleCustomer")
    public String singleCustomer(@ModelAttribute Customer customer){
        Customer singleCustomer = null;
        int size = customers.size();
        for(int i=0 ; i<size;i++) {
            if (customers.get(i).getCustomerId() == customer.getCustomerId()) {
                System.out.println("customer found");
                System.out.println(customers.get(i).getName());
                return "customer";
            }
        }
        System.out.println("Customer not found");
        return "customer";
    } 
}
