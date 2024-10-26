package com.example.crud.controller;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import com.example.crud.domain.sales.Sales;
import com.example.crud.domain.sales.SalesRequestDTO;
import com.example.crud.domain.sales.SalesResponseDTO;
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
    @GetMapping
    public ResponseEntity<List<SalesResponseDTO>>getAll(@RequestParam(defaultValue = "0") int page,@RequestParam(defaultValue = "10") int size ){
        List<SalesResponseDTO> allSales = this.salesService.getAll(page, size);  
        return ResponseEntity.ok(allSales);
    }
    @PutMapping("/{id}")
    public ResponseEntity<String> updateSales(@PathVariable UUID id,@RequestBody SalesResponseDTO body){
        this.salesService.updateSales(id, body);
        return ResponseEntity.ok().body("Updated with sucess");
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteSales(@PathVariable UUID id){
        this.salesService.deleteSales(id);
        return ResponseEntity.ok().body("Deleted with sucess");
    }
}
