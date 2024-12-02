//package com.example.coffeeshopmanagement.controller;
//
//import com.example.coffeeshopmanagement.service.UserService;
//import org.apache.catalina.User;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//public class UserController {
//
//    @Autowired
//    private UserService service;
//
//    @PostMapping("/Register")
//    public User register(@RequestBody User user) {
//        return service.register(user);
//    }
//    @PostMapping("/Login")
//    public String login(@RequestBody User user) {
//
//        return service.verify(user);
////        System.out.println(user);
////        return "Success";
//    }
//
//}
