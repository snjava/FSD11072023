package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entity.Billing;

@Repository
public interface BillingRepository extends JpaRepository<Billing, Integer> {

}
