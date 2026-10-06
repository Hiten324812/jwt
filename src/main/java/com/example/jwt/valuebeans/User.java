package com.example.jwt.valuebeans;


import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class User {

    private String userId;
    private String userName;
    private String email;
}

