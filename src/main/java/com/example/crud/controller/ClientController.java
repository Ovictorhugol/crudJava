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

import com.example.crud.domain.client.Client;
import com.example.crud.domain.client.ClientRequestDTO;
import com.example.crud.domain.client.ClientResponseDTO;
import com.example.crud.service.ClientService;

@RestController
@RequestMapping("/client")
public class ClientController {
    @Autowired
    private ClientService clientService;

    @PostMapping
    public ResponseEntity<Client> create(@RequestBody ClientRequestDTO body){
        Client newClient = this.clientService.createClient(body);
        return ResponseEntity.ok(newClient);
    }
    @GetMapping
    public ResponseEntity<List<ClientResponseDTO>> getAll(@RequestParam(defaultValue = "0") int page, @RequestParam(defaultValue = "10") int size){
        List<ClientResponseDTO> allClients = this.clientService.getAll(page, size);  
        return ResponseEntity.ok(allClients);
    }
    @PutMapping("/{id}")
    public ResponseEntity<String> updateClient(@PathVariable UUID id,@RequestBody ClientResponseDTO body){
        this.clientService.updateClient(id, body);
        return ResponseEntity.ok().body("Updated with sucess");
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteClient(@PathVariable UUID id){
        this.clientService.deleteClient(id);
        return ResponseEntity.ok().body("deleted with success");
    }

}
