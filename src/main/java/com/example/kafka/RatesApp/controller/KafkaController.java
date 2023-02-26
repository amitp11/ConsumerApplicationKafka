package com.example.kafka.RatesApp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.kafka.RatesApp.model.FxMessage;
import com.example.kafka.RatesApp.services.ProducerClass;

@RestController
@RequestMapping("/rest/api")
public class KafkaController {

	@Autowired
	private ProducerClass producer;
	
	public KafkaController() {
		this.producer = producer;
	}
	
	@GetMapping("/msg")
	public void getMessageFromClient(@RequestParam("message") String message) {
		this.producer.sendMessage(message);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/msgs", consumes = { MediaType.APPLICATION_JSON_VALUE })
	public void getMessagesFromClient(@RequestBody FxMessage fxMessage) {
		//System.out.println("Check this received :-> " + fxMessage.toString());
		this.producer.sendMessage(fxMessage.toString());
	}

}
