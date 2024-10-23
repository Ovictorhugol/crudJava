package com.example.crud.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.crud.domain.sales.Sales;

public interface SalesRepository extends JpaRepository<Sales, UUID> {

}
