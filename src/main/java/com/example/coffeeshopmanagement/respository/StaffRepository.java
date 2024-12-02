package com.example.coffeeshopmanagement.respository;

import com.example.coffeeshopmanagement.model.Staff;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StaffRepository extends JpaRepository<Staff, Integer> {

}
