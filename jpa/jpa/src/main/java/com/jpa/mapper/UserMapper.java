package com.jpa.mapper;

import com.jpa.model.dto.UserDTO;
import com.jpa.model.entity.User;
import com.jpa.model.entity.UserDetails;

public class UserMapper  extends AbstractMapper<User, UserDTO>{
    @Override
    public UserDetails toEntity(UserDetails userDetails) {
        return null;
    }

    @Override
    public User toEntity(UserDTO userDTO) {
        User user = new User();
        user.setId(userDTO.getId());
        user.setUsername(userDTO.getUsername());
        user.setPassword(userDTO.getPassword());
        user.setRole(userDTO.getRole());
        return null;
    }

    @Override
    public UserDTO toDto(User user) {
        UserDTO userDTO = new UserDTO();
        userDTO.setId(user.getId());
        userDTO.setUsername(user.getUsername());
        userDTO.setPassword(user.getPassword());
        userDTO.setRole(user.getRole());
        return userDTO;
    }
}
