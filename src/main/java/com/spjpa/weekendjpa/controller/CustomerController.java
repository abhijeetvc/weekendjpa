package com.spjpa.weekendjpa.controller;

import com.spjpa.weekendjpa.model.Customer;
import com.spjpa.weekendjpa.repository.CustomerRepository;
import com.spjpa.weekendjpa.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.transaction.Transactional;


@RestController
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @Autowired
    private CustomerRepository customerRepository;

    @PostMapping("/savecustomer")
    public String saveCustomer(@RequestBody Customer customer){
        customerService.addCustomer(customer);
       // customerRepository.save(customer);
        return "Customer saved";
    }
}
