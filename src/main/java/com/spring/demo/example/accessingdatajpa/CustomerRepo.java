package com.spring.demo.example.accessingdatajpa;

import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface CustomerRepo extends CrudRepository<Customer, Long> {
    List<Customer> findByLastName(String lastName);
    Optional<Customer> findById(Long id);
    // Returns an empty Optional instance. No value is present for this Optional.
}
