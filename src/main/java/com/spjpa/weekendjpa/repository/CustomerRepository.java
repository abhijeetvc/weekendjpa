package com.spjpa.weekendjpa.repository;

import com.spjpa.weekendjpa.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;


@Transactional
public interface CustomerRepository extends JpaRepository<Customer,Integer> {
}
