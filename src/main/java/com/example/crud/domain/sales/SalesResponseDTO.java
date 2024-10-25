package com.example.crud.domain.sales;
import java.util.UUID;
import java.util.Date;

public record SalesResponseDTO(UUID id,String saleDescription, Date saleDate, Double salePrice) {

}
