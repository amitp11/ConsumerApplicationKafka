package com.example.kafka.RatesApp.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class ConsumerClass {

	private static final Logger logger = LoggerFactory.getLogger(ConsumerClass.class);
	
	@KafkaListener(topics = "User_Topic", groupId = "G1")
	public void consume(String message) {
		logger.info(String.format("** Received Message -> %s",message));
		System.out.println("The message received is "+message);
	}
}
