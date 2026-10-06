package com.example.jwt.controller;


import com.example.jwt.services.UserService;
import com.example.jwt.valuebeans.BurgerMeal;
import com.example.jwt.valuebeans.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping("/api")
public class HomeController {

    @Autowired
    private UserService userService;

     @GetMapping("/person")
    public ResponseEntity<Object> user(){
        HashMap<String,Object> map = new HashMap<>();
         BurgerMeal plainBurger = new BurgerMeal.BurgerBuilder("wheat", "veg")
                 .build();

         // Burger with cheese only
         BurgerMeal burgerWithCheese = new BurgerMeal.BurgerBuilder("wheat", "veg")
                 .withCheese(true)
                 .build();

         // Fully loaded burger
         List<String> toppings = Arrays.asList("lettuce", "onion", "jalapeno");
         BurgerMeal loadedBurger = new BurgerMeal.BurgerBuilder("multigrain", "chicken")
                 .withCheese(true)
                 .withToppings(toppings)
                 .withSide("fries")
                 .withDrink("coke")
                 .build();
       map.put("burger meal",loadedBurger);

        return ResponseEntity.ok(map);
    }

    @GetMapping("/getuser")
    public ResponseEntity<Object> users(Principal principal){
         HashMap<String,Object> map = new HashMap<>();

         map.put("login-user",principal.getName());

         return ResponseEntity.ok(map);

    }
}
