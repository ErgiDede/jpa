package com.jpa.model.dto;

import com.jpa.model.enums.UserRole;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO {

    private Long id;
    private String username;

    private String password;
    private UserRole role;

    @Override
    public String toString() {
        return "UserDTO{" +
                "username='" + username + '\'' +
                ", role=" + role +
                '}';
    }

}
