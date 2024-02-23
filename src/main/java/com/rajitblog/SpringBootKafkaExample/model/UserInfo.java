package com.rajitblog.SpringBootKafkaExample.model;

import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class UserInfo {
    private long userId;
    private String name;

}
