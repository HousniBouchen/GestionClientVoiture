
package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.client.entities.Client;
import com.example.client.repositories.ClientRepository;

@SpringBootApplication
public class GestionClientsApplication {

	public static void main(String[] args) {
		SpringApplication.run(GestionClientsApplication.class, args);
	}
	@Bean
	CommandLineRunner initializeH2Database(ClientRepository clientRepository)
	{
		return args -> {
			clientRepository.save(new Client(Long.parseLong("1"), "Amine SAFI", Float.parseFloat("23")));
			clientRepository.save(new Client(Long.parseLong("2"), "Amal ALAOUI", Float.parseFloat("22")));
			clientRepository.save(new Client(Long.parseLong("3"), "Samir RAMI", Float.parseFloat("21")));
		};
	}


}
