package com.dt.kafka.KafkaProducer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducer {

    @Autowired private KafkaTemplate<String, String> kafkaTemplate;

    String KafkaTopics = "Kafka_Micro";

    public void send(String message){
        kafkaTemplate.send(KafkaTopics, message);
//        return ;
    }

}
