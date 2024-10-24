package com.example.crud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.crud.domain.sales.Sales;
import com.example.crud.domain.sales.SalesRequestDTO;
import com.example.crud.service.SalesService;
@RestController
@RequestMapping("/sales")
public class SalesController {
    @Autowired
    private SalesService salesService;

    @PostMapping
    public ResponseEntity<Sales> create(@RequestBody SalesRequestDTO body){
        Sales newSales = this.salesService.createSales(body);
        return ResponseEntity.ok(newSales);
    }
}
