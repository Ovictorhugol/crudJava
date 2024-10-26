package com.example.crud.service;


import java.util.List;

import java.util.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.crud.domain.client.Client;
import com.example.crud.domain.client.ClientRequestDTO;
import com.example.crud.domain.client.ClientResponseDTO;
import com.example.crud.repositories.ClientRepository;

import org.springframework.data.rest.webmvc.ResourceNotFoundException;

@Service
public class ClientService {
    @Autowired
    private ClientRepository repository;
    public Client createClient(ClientRequestDTO data) {
     
     
        Client newClient = new Client();
        newClient.setName(data.name());
        newClient.setCpf(data.cpf());
        newClient.setEmail(data.email());
        newClient.setPhoneNumber(data.phonenumber());
        repository.save(newClient);
       
        
        return newClient;
    }
    public List<ClientResponseDTO> getAll(int page, int size){
        Pageable pageable = PageRequest.of(page, size);
        Page<Client> clientsPage = this.repository.findAll(pageable);
        return clientsPage.map(client -> new ClientResponseDTO(client.getId(), client.getName(), client.getCpf(), client.getEmail(), client.getPhoneNumber(), null)).stream().toList();
    }
    public Client updateClient(@PathVariable UUID id, ClientResponseDTO data){
        Client clientUpdate = this.repository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Not Found"));
        clientUpdate.setCpf(data.cpf());
        clientUpdate.setPhoneNumber(data.phonenumber());
        clientUpdate.setEmail(data.email());
        clientUpdate.setName(data.name());
        repository.save(clientUpdate);
        return clientUpdate;
    }

    public Client deleteClient(@PathVariable UUID id){
        Client clientUpdate = this.repository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Not Found"));
        repository.delete(clientUpdate);
        return clientUpdate;
    }
}
