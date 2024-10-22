package com.example.crud.domain.sales;

import java.util.Date;
import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name = "sales")
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Sales {
    @Id
    @GeneratedValue
    private UUID id;

    private String saleDescription;
    
    private Date saleDate;

    private Double salePrice;
}
