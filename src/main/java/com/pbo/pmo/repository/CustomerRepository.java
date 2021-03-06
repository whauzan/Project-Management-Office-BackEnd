package com.pbo.pmo.repository;

import com.pbo.pmo.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,Integer> {
    List<Customer> findAllByCompanyId(int company_id);
}
