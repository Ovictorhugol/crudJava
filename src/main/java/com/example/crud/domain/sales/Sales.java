package com.example.crud.domain.sales;

import java.util.Date;
import java.util.UUID;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
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
    

    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    private Date saleDate;

    private Double salePrice;
    
}
