package com.quan12yt.kafkademo.engine;

import com.quan12yt.kafkademo.models.Users;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;



@Service
public class Producer {
    private static final Logger logger = LoggerFactory.getLogger(Producer.class);
    private static final String TOPIC = "users";
    private static final String TOPIC2 = "test";

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;
    @Autowired
    private KafkaTemplate<String, String> template;

    public void sendMessage(String message){
        logger.info(String.format("### - > Producing message -> "+ message));
        this.kafkaTemplate.send(TOPIC, message);
    }

    public void sendMessage1(Users u){
        logger.info(String.format("### - > Sending user: -> "+ u.getUserName()));
        this.template.send(TOPIC2, u.getUserName());
    }

}
