package com.example.coffeeshopmanagement.dto.Request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


public record CreateStaffDto (
        String name,
        String position,
        double salary,
        String phone){

}