package com.example.coffeeshopmanagement.mapper;

import com.example.coffeeshopmanagement.feature.auth.dto.RegisterRequest;
import com.example.coffeeshopmanagement.model.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {
    User fromRegisterRequest(RegisterRequest registerRequest);
}
