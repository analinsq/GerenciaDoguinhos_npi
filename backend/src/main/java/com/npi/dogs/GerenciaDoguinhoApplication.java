package com.npi.dogs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = { "com.npi.dogs.*" })
@EnableJpaRepositories("com.npi.dogs.repository")
@EntityScan("com.npi.dogs.model")
public class GerenciaDoguinhoApplication {

    public static void main(String[] args) {
        SpringApplication.run(GerenciaDoguinhoApplication.class, args);
    }
}
