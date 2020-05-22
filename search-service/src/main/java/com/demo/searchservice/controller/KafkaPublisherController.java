package com.demo.searchservice.controller;

import javax.xml.transform.Source;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.context.annotation.Bean;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.MessageChannel;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.searchservice.entity.Order;
import com.demo.searchservice.entity.User;

@EnableBinding(org.springframework.cloud.stream.messaging.Source.class)
@RestController
public class KafkaPublisherController {
	
	
	@Qualifier
    @Autowired
    private MessageChannel output;

    @PostMapping("/publish")
    public User publishEvent(@RequestBody User user) {
    	output.send(org.springframework.messaging.support.MessageBuilder.withPayload(user).build());
        return user;
    }
}