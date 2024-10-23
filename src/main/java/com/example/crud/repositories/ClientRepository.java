package com.example.crud.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.crud.domain.client.Client;

public interface ClientRepository extends JpaRepository<Client, UUID> {

}
