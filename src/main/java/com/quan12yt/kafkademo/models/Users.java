package com.quan12yt.kafkademo.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Users {
    private Long userId;
    private String userName;
    private Integer age;
}
