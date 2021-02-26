package com.quan12yt.kafkademo.engine;

import com.quan12yt.kafkademo.models.Users;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class Consumer {

    private static final Logger logger = LoggerFactory.getLogger(Consumer.class);

    @KafkaListener(topics = "users", groupId = "group_id")
    public void consume(String mess){
        logger.info(String.format("### -> Consumed message -> " +mess));
    }

    @KafkaListener(topics = "test", groupId = "group_id")
    public void consumee(String ms){
        logger.info("Recieved User name: " + ms);
    }
}
