package com.example.coffeeshopmanagement.service;

import com.example.coffeeshopmanagement.model.Staff;

import java.util.List;

public interface StaffService {

    Staff createStaff(Staff staff);

    List<Staff> getAllStaff();

    // Fetch staff by ID
    Staff getStaffById(Long id);

    // Fetch staff by ID
    Staff getStaffById(Integer id);

    // Update an existing staff record
    Staff updateStaff(Integer id, Staff staffDetails);

    void deleteStaffById(Integer id);
}
