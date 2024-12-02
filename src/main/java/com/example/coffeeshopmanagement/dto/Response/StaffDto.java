package com.example.coffeeshopmanagement.dto.Response;

public record StaffDto(
        Integer id,
        String name,
        String position,
        double salary,
        String phone
) {

}
