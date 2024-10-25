package com.example.crud.domain.client;
import java.util.UUID;
public record ClientResponseDTO(UUID id,String name, String cpf,String email, String phonenumber, UUID salesId) {

}
