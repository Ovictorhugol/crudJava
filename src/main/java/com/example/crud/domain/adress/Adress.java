package com.example.crud.domain.adress;

import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table(name = "adress")
@Entity
public class Adress {
    @Id
    @GeneratedValue
    private UUID id;

    private String city;
    private String uf;
    
}
