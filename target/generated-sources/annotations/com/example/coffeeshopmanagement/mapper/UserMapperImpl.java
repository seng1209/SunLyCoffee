package com.example.coffeeshopmanagement.mapper;

import com.example.coffeeshopmanagement.feature.auth.dto.RegisterRequest;
import com.example.coffeeshopmanagement.model.User;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-12-02T13:28:40+0700",
    comments = "version: 1.6.0.Beta1, compiler: javac, environment: Java 17.0.10 (Oracle Corporation)"
)
@Component
public class UserMapperImpl implements UserMapper {

    @Override
    public User fromRegisterRequest(RegisterRequest registerRequest) {
        if ( registerRequest == null ) {
            return null;
        }

        User user = new User();

        user.setPhoneNumber( registerRequest.phoneNumber() );
        user.setEmail( registerRequest.email() );
        user.setPin( registerRequest.pin() );
        user.setPassword( registerRequest.password() );
        user.setNationalCardId( registerRequest.nationalCardId() );
        user.setName( registerRequest.name() );
        user.setGender( registerRequest.gender() );

        return user;
    }
}
