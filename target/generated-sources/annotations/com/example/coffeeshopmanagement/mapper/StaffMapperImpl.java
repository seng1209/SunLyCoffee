package com.example.coffeeshopmanagement.mapper;

import com.example.coffeeshopmanagement.dto.Request.CreateStaffDto;
import com.example.coffeeshopmanagement.dto.Response.StaffDto;
import com.example.coffeeshopmanagement.model.Staff;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-12-02T13:28:40+0700",
    comments = "version: 1.6.0.Beta1, compiler: javac, environment: Java 17.0.10 (Oracle Corporation)"
)
@Component
public class StaffMapperImpl implements StaffMapper {

    @Override
    public Staff fromStaffDto(CreateStaffDto createStaffDto) {
        if ( createStaffDto == null ) {
            return null;
        }

        Staff staff = new Staff();

        staff.setName( createStaffDto.name() );
        staff.setPosition( createStaffDto.position() );
        staff.setSalary( createStaffDto.salary() );
        staff.setPhone( createStaffDto.phone() );

        return staff;
    }

    @Override
    public StaffDto toStaffDto(Staff staff) {
        if ( staff == null ) {
            return null;
        }

        Integer id = null;
        String name = null;
        String position = null;
        double salary = 0.0d;
        String phone = null;

        id = staff.getId();
        name = staff.getName();
        position = staff.getPosition();
        salary = staff.getSalary();
        phone = staff.getPhone();

        StaffDto staffDto = new StaffDto( id, name, position, salary, phone );

        return staffDto;
    }

    @Override
    public List<StaffDto> toStaffDtoList(List<Staff> staffList) {
        if ( staffList == null ) {
            return null;
        }

        List<StaffDto> list = new ArrayList<StaffDto>( staffList.size() );
        for ( Staff staff : staffList ) {
            list.add( toStaffDto( staff ) );
        }

        return list;
    }
}
