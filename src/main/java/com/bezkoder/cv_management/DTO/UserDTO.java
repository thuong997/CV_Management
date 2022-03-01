package com.bezkoder.cv_management.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO {

    private int accId;

    private String username;

    private String password;

    private String email;

    private String fullName;

}
