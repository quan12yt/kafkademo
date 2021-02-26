package com.quan12yt.kafkademo.controllers;

import com.quan12yt.kafkademo.engine.Producer;
import com.quan12yt.kafkademo.models.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KafkaController {

    private final Producer producer;

    @Autowired
    KafkaController(Producer producer){
        this.producer = producer;
    }

    @PostMapping("/publish")
    public String sendMessageToKafkaTopic(@RequestParam String mess){
        this.producer.sendMessage(mess);
        return "Success";
    }

    @PostMapping("/publish/users")
    public Users sendMessageToKafkaTopic1(@RequestBody Users u){
        this.producer.sendMessage1(u);
        return u;
    }
}
