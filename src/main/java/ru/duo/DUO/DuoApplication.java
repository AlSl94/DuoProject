package ru.duo.DUO;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
public class DuoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DuoApplication.class, args);
	}

}
