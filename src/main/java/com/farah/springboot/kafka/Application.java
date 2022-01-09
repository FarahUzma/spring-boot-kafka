package com.farah.springboot.kafka;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;

@SpringBootApplication
public class Application implements ApplicationRunner {

	// dervied from KafkaProducerConfig
	@Autowired
	private KafkaTemplate<String, String> kafkaTemplate;

	public void sendMessage(String msg) {
		kafkaTemplate.send("first_topic", msg);
	}
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	//derived from KafkaConsumerConfig
	@KafkaListener(topics = "first_topic", groupId = "my-third-app")
	public void listen(String message) {
		System.out.println("Received Messasge in group - my-third-app: " + message);
	}
	@Override
	public void run(ApplicationArguments args) throws Exception {
		sendMessage("Hi Farah");
	}

}
