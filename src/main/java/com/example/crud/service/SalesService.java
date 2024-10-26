package com.example.crud.service;

import java.util.Date;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;


import com.example.crud.domain.sales.Sales;
import com.example.crud.domain.sales.SalesRequestDTO;
import com.example.crud.domain.sales.SalesResponseDTO;
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

    public List<SalesResponseDTO> getAll(int page, int size){
        Pageable pageable = PageRequest.of(page, size);
        Page<Sales> salesPage = this.repository.findAll(pageable);
        return salesPage.map(sales -> new SalesResponseDTO(sales.getId(), sales.getSaleDescription(), sales.getSaleDate(), sales.getSalePrice())).stream().toList();
    }
    public Sales updateSales(@PathVariable UUID id, SalesResponseDTO data){
        Sales salesUpdate = this.repository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Not Found"));
        salesUpdate.setSaleDescription(data.saleDescription());
        salesUpdate.setSalePrice(data.salePrice());
        repository.save(salesUpdate);
        return salesUpdate;
    }

    public Sales deleteSales(@PathVariable UUID id){
        Sales salesDelete = this.repository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Not Found"));
        repository.delete(salesDelete);
        return salesDelete;
    }
}
