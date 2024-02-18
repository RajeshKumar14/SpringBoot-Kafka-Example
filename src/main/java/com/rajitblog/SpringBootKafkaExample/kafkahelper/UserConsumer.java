package com.rajitblog.SpringBootKafkaExample.kafkahelper;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.rajitblog.SpringBootKafkaExample.model.UserInfo;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class UserConsumer {

    @KafkaListener(topics = "my-topic", groupId = "my-group-id")
    public void consumeUserInfo(String msg) throws JsonProcessingException {
        System.out.println("Received message: " + msg);
    }
}
