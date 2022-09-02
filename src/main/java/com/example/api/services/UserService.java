package com.example.api.services;

import com.example.api.domain.User;
import com.example.api.domain.dto.UserDto;

import java.util.List;

public interface UserService {
    User findById(Integer id);
    List<User> findAll();
    User create(UserDto obj);
    User update(UserDto obj);
}
