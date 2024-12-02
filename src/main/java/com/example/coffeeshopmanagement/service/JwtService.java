//package com.example.coffeeshopmanagement.service;
//
//import io.jsonwebtoken.Jwts;
//import io.jsonwebtoken.security.Keys;
//import lombok.Data;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.stereotype.Component;
//import org.springframework.stereotype.Service;
//
//import javax.crypto.KeyGenerator;
//import javax.crypto.SecretKey;
//import java.security.Key;
//import java.security.NoSuchAlgorithmException;
//import java.util.Base64;
//import java.util.Date;
//import java.util.HashMap;
//import java.util.Map;
//
//@Component
//@Service
//public class JwtService {
//    private String secretKey="";
//
//    public JwtService() throws NoSuchAlgorithmException {
//        KeyGenerator keyGen=KeyGenerator.getInstance("HmacSHA256");
//        SecretKey sk =keyGen.generateKey();
//        secretKey=Base64.getEncoder().encodeToString(sk.getEncoded());
//    }
//    public String generateToken(String username) {
//
//        Map<String,Object> claims = new HashMap<>();
//
//       return Jwts.builder()
//               .claims()
//               .add(claims)
//               .subject(username)
//               .issuedAt(new Date(System.currentTimeMillis()))
//               .expiration(new Date(System.currentTimeMillis()+60*60*30))
//               .and()
//               .signWith(getkey())
//               .compact();
//
//
////        return "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.ey" +
////                "JzdWIiOiIxMjM0NTY3ODkwIiwibmFtZSI6IkpvaG4gRG9lIiw" +
////                "iaWF0IjoxNTE2MjM5MDIyfQ.SflKxwRJSMeKKF2QT4fwpMeJf36POk6yJV_adQssw5c";
//    }
//
//    private Key getkey() {
//        byte[] keyBytes = secretKey.getBytes();
//        return Keys.hmacShaKeyFor(keyBytes);
//    }
//
//
//    public String extractUserName(String token) {
//        //extract the username from jwt token
//        return "";
//    }
//
//
//
//    public boolean validateToken(String token, UserDetails userDetails) {
//        return true;
//    }
//}
