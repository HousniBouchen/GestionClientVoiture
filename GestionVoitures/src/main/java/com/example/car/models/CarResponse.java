package com.example.car.models;

import com.example.client.entities.Client;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CarResponse {
	private Long id;
	private String brand;
	private String model;
	private String matricule;
	private Client client;
}
