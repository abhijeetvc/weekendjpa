package com.spjpa.weekendjpa.service;

import com.spjpa.weekendjpa.model.Customer;
import com.spjpa.weekendjpa.repository.CustomerRepository;
import org.hibernate.PersistentObjectException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

//@Transactional
@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    @Transactional(rollbackFor = { Exception.class })
    public void addCustomer(Customer customer){
        try{
            customerRepository.save(customer);
        }catch(Exception e) {
            throw new PersistentObjectException("RollBack transaction...");
        }
    }
}
