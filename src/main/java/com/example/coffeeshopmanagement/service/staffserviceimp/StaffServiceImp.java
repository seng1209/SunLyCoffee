package com.example.coffeeshopmanagement.service.staffserviceimp;

import com.example.coffeeshopmanagement.model.Staff;
//import com.example.coffeeshopmanagement.respository.StaffRepo;
import com.example.coffeeshopmanagement.respository.StaffRepository;
import com.example.coffeeshopmanagement.service.StaffService;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StaffServiceImp implements StaffService {

    private final StaffRepository staffRepository;

    //Create new Staff
    @Override
    public Staff createStaff(Staff staff){
        try {
            staffRepository.save(staff);
        }catch (Exception e){
            e.getMessage();
        }

        return staff;
    }

    @Override
    public List<Staff> getAllStaff() {
        return staffRepository.findAll();
    }

    @Override
    public Staff getStaffById(Long id) {
        return null;
    }

    @Override
    // Fetch staff by ID
    public Staff getStaffById(Integer id) {
        return staffRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Staff not found with ID: " + id));
    }
    @Override
    // Update an existing staff record
    public Staff updateStaff(Integer id, Staff staffDetails) {
        return staffRepository.findById(id)
                .map(staff -> {
                    staff.setName(staffDetails.getName());
                    staff.setPosition(staffDetails.getPosition());
                    staff.setSalary(staffDetails.getSalary());
                    staff.setPhone(staffDetails.getPhone());
                    return staffRepository.save(staff);
                })
                .orElseThrow(() -> new RuntimeException("Staff not found with ID: " + id));
    }

    @Override
    public void deleteStaffById(Integer id) {

    }

    // Delete a staff record by ID
//    public void deleteStaff(Long id) {
//        if (!staffRepo.existsById(Math.toIntExact(id))) {
//            throw new RuntimeException("Staff not found with ID: " + id);
//        }
//        try {
//            staffRepo.deleteById(Math.toIntExact(id));
//        } catch (Exception e) {
//            Logger logger = null;
//            logger.error("Error deleting staff with ID: " + id, e);
//            throw new RuntimeException("Error deleting staff: " + e.getMessage());
//        }
//    }



}
