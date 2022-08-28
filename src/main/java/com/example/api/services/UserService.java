package com.example.api.services;

import com.example.api.domain.User;

public interface UserService {
    User findById(Integer id);
}
