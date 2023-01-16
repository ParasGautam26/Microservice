package com.nagarro.customermanagementservice.resources;

import com.nagarro.customermanagementservice.controllers.CustomerController;
import com.nagarro.customermanagementservice.models.Customer;
import com.nagarro.customermanagementservice.models.Customers;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;


@RestController
@RequestMapping("/customer")
public class CustomerResource {

	@RequestMapping("/allCustomers")
    public Customers getCustomers(){
		Customers customers = new Customers();
		
		customers.setCustomers(CustomerController.customers);
		System.out.println(customers);
      	return customers;
    }
	
}
