package com.rajitblog.SpringBootKafkaExample.service;

import com.rajitblog.SpringBootKafkaExample.kafkahelper.UserProducer;
import com.rajitblog.SpringBootKafkaExample.model.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserProducer userProducer;
    @Override
    public void addUser(UserInfo userInfo) {
        userProducer.producedUser("my-topic",userInfo);
    }
}
