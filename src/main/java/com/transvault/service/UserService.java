package com.transvault.service;

import com.transvault.model.Users;
import com.transvault.repository.UserRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@Transactional
public class UserService implements IUserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public Users getUserById(UUID userId) {
        return userRepository.findById(userId).orElseGet(() -> new Users());
    }

    @Override
    public Users createUser(Users user) {
        return userRepository.save(user);
    }

    @Override
    public List<Users> getUserList() {
        return userRepository.findAll();
    }
}
