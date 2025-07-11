package com.deliveryboy.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaConfig {

    // Using the NewTopic object we will create a new topic
    @Bean 
    public NewTopic topic(){
        return TopicBuilder
                .name("AppConstants.LOCATION_TOPIC_NAME")
                .partitions(3)
                .replicas(2)
                .build();
    }
}
