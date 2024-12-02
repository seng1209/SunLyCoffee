package com.example.coffeeshopmanagement.init;

import com.example.coffeeshopmanagement.feature.user.RoleRepository;
import com.example.coffeeshopmanagement.feature.user.UserRepository;
import com.example.coffeeshopmanagement.model.Role;
import com.example.coffeeshopmanagement.model.Staff;
import com.example.coffeeshopmanagement.model.User;
//import com.example.coffeeshopmanagement.respository.StaffRepo;
import com.example.coffeeshopmanagement.respository.StaffRepository;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.UUID;

@Component
@RequiredArgsConstructor
public class DataInit {

    private final StaffRepository staffRepository;
    private final UserRepository userRepository;
    private final RoleRepository roleRepository;
    private final PasswordEncoder passwordEncoder;

    @PostConstruct
    void init(){

        if (staffRepository.count() == 0){

            Staff staff1 = new Staff();
            staff1.setName("Sun Ly");
            staff1.setPosition("IT Manager");
            staff1.setSalary(2800.00D);
            staff1.setPhone("093-284-283");

            Staff staff2 = new Staff();
            staff2.setName("Srey Nich");
            staff2.setPosition("UX/UI Design and Front End Dev");
            staff2.setSalary(1200.00D);
            staff2.setPhone("010-284-452");

            Staff staff3 = new Staff();
            staff3.setName("Seng Hak");
            staff3.setPosition("Back End Dev");
            staff3.setSalary(800.00D);
            staff3.setPhone("021-044-283");

            staffRepository.saveAll(List.of(staff1, staff2, staff3));

        }

        if (userRepository.count() == 0) {

            Role user = new Role();
            user.setName("USER");

            Role customer = new Role();
            customer.setName("CUSTOMER");

            Role manager = new Role();
            manager.setName("MANAGER");

            Role admin = new Role();
            admin.setName("ADMIN");

            roleRepository.saveAll(List.of(user, customer, manager, admin));

            User user1 = new User();
            user1.setUuid(UUID.randomUUID().toString());
            user1.setName("Chan Chhaya");
            user1.setGender("Male");
            user1.setPhoneNumber("098459947");
            user1.setEmail("admin@istad.co");
            user1.setPin("1234");
            user1.setPassword(passwordEncoder.encode("qwerqwer"));
            user1.setNationalCardId("123456789");
            user1.setProfileImage("user/avatar.png");
            user1.setStudentCardId("ISTAD-000001");
            user1.setIsDeleted(false);
            user1.setIsBlocked(false);
            user1.setIsVerified(true);
            user1.setRoles(List.of(user, admin));

            User user2 = new User();
            user2.setUuid(UUID.randomUUID().toString());
            user2.setName("Leo Messi");
            user2.setGender("Male");
            user2.setPhoneNumber("099459947");
            user2.setEmail("manager@istad.co");
            user2.setPin("1234");
            user2.setPassword(passwordEncoder.encode("qwerqwer"));
            user2.setNationalCardId("88889999");
            user2.setProfileImage("user/avatar.png");
            user2.setIsDeleted(false);
            user2.setIsBlocked(false);
            user2.setIsVerified(true);
            user2.setRoles(List.of(user, manager));

            User user3 = new User();
            user3.setUuid(UUID.randomUUID().toString());
            user3.setName("CR7");
            user3.setGender("Male");
            user3.setPhoneNumber("012459947");
            user3.setEmail("customer@istad.co");
            user3.setPin("7777");
            user3.setPassword(passwordEncoder.encode("qwerqwer"));
            user3.setNationalCardId("88889991");
            user3.setProfileImage("user/avatar.png");
            user3.setIsDeleted(false);
            user3.setIsBlocked(false);
            user3.setIsVerified(true);
            user3.setRoles(List.of(user, customer));

            userRepository.saveAll(List.of(user1, user2, user3));
        }
    }

}
