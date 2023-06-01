package com.web.rest.service;


import com.web.rest.dto.UserDto;
import com.web.rest.entity.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    List<User> getAllUsers();

    User getUserById(Long id);

    void addUser(User user);

    void removeUser(Long id);

    void updateUser(User user);

    Optional<User> findByUsername(String username);

    User convertToUser(UserDto userDto);
}