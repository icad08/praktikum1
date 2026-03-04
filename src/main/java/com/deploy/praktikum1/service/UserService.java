package com.deploy.praktikum1.service;

import com.deploy.praktikum1.model.entity.User;
import com.deploy.praktikum1.model.entity.dto.UserAddRequest;
import com.deploy.praktikum1.model.entity.dto.UserDto;
import com.deploy.praktikum1.repository.UserRepository;

import java.util.List;

public interface UserService {
    UserDto AddUser(UserAddRequest request);
    List<UserDto> getAllUser();
    UserDto getUserById(String id);
    UserDto UpdateUser (String id, UserAddRequest request);
    void DeleteUser (String id);
}
