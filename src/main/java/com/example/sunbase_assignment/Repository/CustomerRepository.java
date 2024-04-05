package com.example.sunbase_assignment.Repository;

import com.example.sunbase_assignment.Model.Customer;
import org.springframework.stereotype.Repository;


// CustomerRepository.java

import com.example.sunbase_assignment.Model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
@Repository
public interface CustomerRepository extends JpaRepository<Customer,Long> {
}


