package com.example.crud.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.crud.domain.adress.Adress;

public interface AdressRepository extends JpaRepository<Adress, UUID>{

}
