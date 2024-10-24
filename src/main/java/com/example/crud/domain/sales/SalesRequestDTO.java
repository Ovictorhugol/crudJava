package com.example.crud.domain.sales;

import java.util.Date;

public record SalesRequestDTO(String saleDescription, Long saleDate, Double salePrice) {

}
