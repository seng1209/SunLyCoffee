package com.example.coffeeshopmanagement.mapper;

import com.example.coffeeshopmanagement.dto.Request.CreateStaffDto;
import com.example.coffeeshopmanagement.dto.Response.StaffDto;
import com.example.coffeeshopmanagement.model.Staff;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface StaffMapper {

    Staff fromStaffDto(CreateStaffDto createStaffDto);

    StaffDto toStaffDto(Staff staff);

    List<StaffDto> toStaffDtoList(List<Staff> staffList);

}
