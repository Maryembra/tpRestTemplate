package exemple.eurekafeignclient;


import exemple.eurekafeignclient.entities.Voiture;
import exemple.eurekafeignclient.repository.VoitureRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

@EnableDiscoveryClient
@SpringBootApplication
public class EurekaFeignClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaFeignClientApplication.class, args);
    }

    @Bean
    CommandLineRunner start(VoitureRepository voitureRepository) {
        return args -> {
            voitureRepository.save(new Voiture( "mer", "mercedecs", "89073634A", 1L));
            voitureRepository.save(new Voiture( "Gdg", "GOLF", "237947A36", 2L));
            voitureRepository.save(new Voiture("clio", "clio", "32857362", 3L));
        };
    }



}