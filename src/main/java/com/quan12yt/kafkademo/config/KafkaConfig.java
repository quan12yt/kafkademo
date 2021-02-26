package com.quan12yt.kafkademo.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;
import org.springframework.kafka.core.ConsumerFactory;
import org.springframework.kafka.core.DefaultKafkaConsumerFactory;

@Configuration
public class KafkaConfig {

    @Bean
    public NewTopic topicOne() {
        return TopicBuilder.name("ref-1").build();
    }

    @Bean
    public NewTopic topicTwo() {
        return TopicBuilder.name("ref-2").build();
    }
}
