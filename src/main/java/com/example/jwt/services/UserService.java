package com.example.jwt.services;

import com.example.jwt.config.AppConfig;
import com.example.jwt.valuebeans.User;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.*;


@Service
public class UserService {

    List<User> users = new ArrayList<>();

    public UserService(){
        users.add(new User(UUID.randomUUID().toString(),"Hiten Mistry","hitenmistry@gmail.com"));
        users.add(new User(UUID.randomUUID().toString(),"Harshit","harshit@gmail.com"));
        users.add(new User(UUID.randomUUID().toString(),"Ajay","ajay@gmail.com"));
        users.add(new User(UUID.randomUUID().toString(),"Suresh","suresh@gmail.com"));
    }

    public List<User> getUsers(){

        return users;
    }
}
