package com.jpa.main;

import com.jpa.configuration.EntityManagerConfiguration;
import com.jpa.model.dto.UserDTO;
import com.jpa.model.entity.User;
import com.jpa.service.UserService;
import com.jpa.service.impl.UserServiceImpl;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        UserService userService = new UserServiceImpl(EntityManagerConfiguration.getEntityManager());

        // create a new user
           /* User user = new User();
            user.setId(null);
            user.setUsername("Eni");
            user.setPassword("password");
            user.setRole(UserRole.GUEST);
            userService.createUser(user);*/

        // retrieve a user by id
            Long userId = 1L;
            User retrievedUser = userService.findUserById(userId);

            System.out.println(retrievedUser.getUsername());

        // update a user
            /*User retrievedUser = userService.findUserById(1L);
            retrievedUser.setUsername("jane");
            userService.updateUser(retrievedUser);*/

        // delete a user
            /*User user = userService.findUserById(1L);
            userService.deleteUser(user);*/

        List<UserDTO> userDTOList = userService.findAllUsers();
        for (UserDTO user : userDTOList) {
            System.out.println(user);
        }

    }
}
