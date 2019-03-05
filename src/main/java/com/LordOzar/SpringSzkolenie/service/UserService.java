package com.LordOzar.SpringSzkolenie.service;

import com.LordOzar.SpringSzkolenie.domain.Role;
import com.LordOzar.SpringSzkolenie.domain.User;
import com.LordOzar.SpringSzkolenie.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    public void createUser(String username, String password) {
        User user = new User(username, password);
        userRepository.addUser(user);
    }

    public void addRoleToUser(String username, String roleName){
        Role role = new Role(roleName);
        userRepository.addRoleToUser(username, role);
    }
}
