package com.uep.wap.service;

import com.uep.wap.model.Student;
import com.uep.wap.repository.StudentRepository;
import com.uep.wap.dto.StudentDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public void addUser(UserDTO userDTO) {
        User user  = new User()user;
        user.setName(userDTO.getName());
        userRepository.save(user);
    }