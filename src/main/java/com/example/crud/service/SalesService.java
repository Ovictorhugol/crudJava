package com.example.crud.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.crud.domain.sales.Sales;
import com.example.crud.domain.sales.SalesRequestDTO;
import com.example.crud.repositories.SalesRepository;

@Service
public class SalesService {
    @Autowired
    private SalesRepository repository;
    public Sales createSales(SalesRequestDTO data){
        Sales newSales = new Sales();
        newSales.setSaleDescription(data.saleDescription());
        newSales.setSalePrice(data.salePrice());
        newSales.setSaleDate(new Date(data.saleDate()));
        repository.save(newSales);
        return newSales;
    }
}
