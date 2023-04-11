package com.jpa.service.impl;

import com.jpa.mapper.UserMapper;
import com.jpa.model.dto.UserDTO;
import com.jpa.model.entity.User;
import com.jpa.repository.UserRepository;
import com.jpa.service.UserService;

import javax.persistence.EntityManager;
import java.util.List;

public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    private final UserMapper userMapper;


    public UserServiceImpl(EntityManager entityManager) {
        userRepository = new UserRepository(entityManager);
        this.userMapper = new UserMapper();
    }

    @Override
    public void createUser(User user) {
        userRepository.save(user);
    }

    @Override
    public User findUserById(Long id) {
        if (userRepository.findById(id) == null)
            throw new IllegalArgumentException("User with Id : " + id + " does not exist ");
        return userRepository.findById(id);

    }

    @Override
    public List<UserDTO> findAllUsers() {
        return userRepository.findAll().stream().map(userMapper::toDto).toList();
    }

    @Override
    public void updateUser(User user) {
        userRepository.update(user);
    }

    @Override
    public void deleteUser(User user) {
        userRepository.delete(user);
    }

}
