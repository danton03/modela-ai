package edu.danton.carsapi.dto;

public record CarDTO(
  String modelo,
  String fabricante,
  String dataFabricacao,
  double valor,
  int anoModelo
){}
