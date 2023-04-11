package com.jpa.service;

import com.jpa.model.dto.UserDTO;
import com.jpa.model.entity.User;
import com.jpa.repository.UserRepository;

import javax.persistence.EntityManager;
import java.util.List;

public interface UserService {
    User findUserById(Long id);

    void createUser(User user);

    void updateUser(User user);

    void deleteUser(User user);

    List<UserDTO> findAllUsers();


}
