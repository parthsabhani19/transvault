package com.transvault.service;

import com.transvault.model.Users;

import java.util.List;
import java.util.UUID;

public interface IUserService {
    Users getUserById(UUID userId);

    Users createUser(Users user);

    List<Users> getUserList();
}
