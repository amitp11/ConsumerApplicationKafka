package com.example.kafka.RatesApp;

import com.example.kafka.RatesApp.controller.KafkaController;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RatesAppApplication {

	KafkaController kafkaController = new KafkaController();

	public static void main(String[] args) {
		SpringApplication.run(RatesAppApplication.class, args);
		//System.out.println("Hello");
	}
}
