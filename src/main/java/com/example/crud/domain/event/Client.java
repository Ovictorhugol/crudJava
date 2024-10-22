package com.example.crud.domain.event;

import java.util.UUID;

import com.example.crud.domain.adress.Adress;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name ="client")
@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Client {
    @Id
    @GeneratedValue
    private UUID id;
    private String name;
    private String cpf;
    private String phoneNumber;
    private String email;

    @ManyToOne
    @JoinColumn(name = "adress_id")
    private Adress adress;

}
