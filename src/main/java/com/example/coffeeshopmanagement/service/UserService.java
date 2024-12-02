//package com.example.coffeeshopmanagement.service;
//
//import com.example.coffeeshopmanagement.respository.UserRepo;
//import org.apache.catalina.User;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.authentication.AuthenticationManager;
//import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
//import org.springframework.security.core.Authentication;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.stereotype.Service;
//
//@Service
//public class UserService {
//
//    @Autowired
//    private UserRepo repo;
//
//    @Autowired
//    private JwtService jwtService;
//
//    @Autowired
//    AuthenticationManager authenticationManager;
//
//    private BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
//    public User register(User user) {
//        user.setPassword(encoder.encode(user.getPassword()));
//       return repo.save(user);
//    }
//
//    public String verify(User user) {
//        Authentication auth =
//                authenticationManager
//                        .authenticate(new UsernamePasswordAuthenticationToken(user.getUsername(), user.getPassword()));
//                if(auth.isAuthenticated())
//                    return jwtService.generateToken(user.getUsername());
//        return "fail";
//    }
//}
