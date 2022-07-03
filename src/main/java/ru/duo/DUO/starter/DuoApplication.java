package ru.duo.DUO.starter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class DuoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DuoApplication.class, args);
	}

}
