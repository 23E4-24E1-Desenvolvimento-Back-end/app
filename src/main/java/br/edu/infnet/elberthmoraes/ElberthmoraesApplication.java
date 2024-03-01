package br.edu.infnet.elberthmoraes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class ElberthmoraesApplication {

	public static void main(String[] args) {
		SpringApplication.run(ElberthmoraesApplication.class, args);
	}

}
