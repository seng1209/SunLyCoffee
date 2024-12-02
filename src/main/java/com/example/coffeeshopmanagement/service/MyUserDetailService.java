//package com.example.coffeeshopmanagement.service;
//
//import com.example.coffeeshopmanagement.model.Userpincipal;
//import com.example.coffeeshopmanagement.respository.UserRepo;
//import org.apache.catalina.User;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.stereotype.Service;
//
//@Service
//public class MyUserDetailService implements UserDetailsService {
//    @Autowired
//    private static UserRepo repo;
//
//    @Override
//    public  UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//       User user =repo.findByUsername(username);
//       if(user == null) {
//           System.out.println("user not found");
//           throw new UsernameNotFoundException("user not found");
//       }
//       return new Userpincipal(user);
//    }
//}
