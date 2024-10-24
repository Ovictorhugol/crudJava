package com.example.crud.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.crud.domain.client.Client;
import com.example.crud.domain.client.ClientRequestDTO;
import com.example.crud.repositories.ClientRepository;

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
}
