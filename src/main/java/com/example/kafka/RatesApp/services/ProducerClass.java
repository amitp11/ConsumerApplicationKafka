package com.example.kafka.RatesApp.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.example.kafka.RatesApp.model.FxMessage;

@Service
public class ProducerClass {
	private static final Logger logger = LoggerFactory.getLogger(ProducerClass.class);
	private static final String TOPIC = "User_Topic";

	@Autowired
	KafkaTemplate<String,String> kafkaTemplate;

	public void sendMessage(String message) {
		logger.info(String.format("** Sending Message -> %s",message));
		this.kafkaTemplate.send(TOPIC,message);
	}

}
