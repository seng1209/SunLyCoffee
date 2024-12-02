package com.example.coffeeshopmanagement.controller;

import com.example.coffeeshopmanagement.model.Staff;
import com.example.coffeeshopmanagement.service.StaffService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/staff")
@RequiredArgsConstructor
public class StaffController {

    private final StaffService staffService;


    @PostMapping()
    public ResponseEntity<Staff> createStaff(@RequestBody Staff staff) {
        Staff createdStaff = staffService.createStaff(staff);
        return ResponseEntity.ok(createdStaff);
    }

    @GetMapping
    public List<Staff> getAll(){
        return staffService.getAllStaff();
    }


}
