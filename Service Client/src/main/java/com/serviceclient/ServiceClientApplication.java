package com.serviceclient;


import com.serviceclient.entities.Client;
import com.serviceclient.repository.ClientRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

@EnableDiscoveryClient
@SpringBootApplication
public class ServiceClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceClientApplication.class, args);
    }


    @Bean
    CommandLineRunner initializerBaseH2(ClientRepository clientRepository) {
        return args -> {
            clientRepository.save(new Client(null, "Rabab SELIMANI", 22));
            clientRepository.save(new Client(null, "Amal RAMI", 23));
            clientRepository.save(new Client(null, "Maryem Braghni", 22));
        };
    }

}
