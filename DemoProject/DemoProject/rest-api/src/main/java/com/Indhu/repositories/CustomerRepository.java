package com.indhu.restapi.repositories;

import com.indhu.restapi.domain.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {


    Customer getCustomerByCustomerId(Long customerId);
}
