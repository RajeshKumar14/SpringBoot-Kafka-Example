package com.rajitblog.SpringBootKafkaExample.kafkahelper;

import com.rajitblog.SpringBootKafkaExample.model.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class UserProducer {
    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    public void producedUser(String topic, UserInfo userInfo) {

        kafkaTemplate.send(topic, userInfo.toString());
    }
}
