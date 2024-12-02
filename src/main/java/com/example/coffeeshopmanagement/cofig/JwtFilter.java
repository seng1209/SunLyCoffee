//package com.example.coffeeshopmanagement.cofig;
//
//import com.example.coffeeshopmanagement.service.JwtService;
//import com.example.coffeeshopmanagement.service.MyUserDetailService;
//import jakarta.servlet.FilterChain;
//import jakarta.servlet.ServletException;
//import jakarta.servlet.http.HttpServletRequest;
//import jakarta.servlet.http.HttpServletResponse;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
//import org.springframework.security.core.context.SecurityContextHolder;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
//import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
//import org.springframework.stereotype.Component;
//import org.springframework.stereotype.Service;
//import org.springframework.web.filter.OncePerRequestFilter;
//
//import java.io.IOException;
//@Component
//public class JwtFilter extends OncePerRequestFilter {
//
//    @Autowired
//  private JwtService jwtService;
//
//    @Autowired
//    MyUserDetailService myUserDetailService;
//
//
//    @Override
//    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
//        String authHeader = request.getHeader("Authorization");
//        String token=null;
//        String username=null;
//
//        // Extract the token if the Authorization header is present and valid
//
//        if (authHeader != null && authHeader.startsWith("Bearer ")) {
//            token=authHeader.substring(7);
//            username=jwtService.extractUserName(token);
//        }
//// Validate the token and set the SecurityContext if authentication is not already present
//        if (username != null && SecurityContextHolder.getContext().getAuthentication() == null) {
//            UserDetails userDetails = myUserDetailService.loadUserByUsername(username);
//            if (jwtService.validateToken(token, userDetails)) {
//                UsernamePasswordAuthenticationToken authToken =
//                        new UsernamePasswordAuthenticationToken(userDetails, null, userDetails.getAuthorities());
//                authToken.setDetails(new WebAuthenticationDetailsSource().buildDetails(request));
//                SecurityContextHolder.getContext().setAuthentication(authToken);
//            }
//        }
//        // Continue with the next filter in the chain
//        filterChain.doFilter(request, response);
//
//    }
//}
