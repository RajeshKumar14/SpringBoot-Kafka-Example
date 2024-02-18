package com.rajitblog.SpringBootKafkaExample.controller;

import com.rajitblog.SpringBootKafkaExample.model.UserInfo;
import com.rajitblog.SpringBootKafkaExample.service.UserService;
import lombok.extern.log4j.Log4j;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.logging.Logger;
@Log4j2
@RestController
@RequestMapping("/kafka")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/user/add")
    public ResponseEntity<?> addUser(@RequestBody UserInfo userInfo) {
        try {
            userService.addUser(userInfo);
            return new ResponseEntity<>("success", HttpStatus.OK);
        }catch (Exception e) {
            log.error("Exception:",e);
            return new ResponseEntity<>(e, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
