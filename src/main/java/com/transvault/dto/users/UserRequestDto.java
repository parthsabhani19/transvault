package com.transvault.dto.users;

import lombok.Data;

@Data
public class UserRequestDto {

//    private UUID userId;
//    private String userName;
//    private String password;
//    private String createdAt;
//    private String updatedAt;
//    private String isActive;
//    private String remarks;

    private String firstName;
    private String lastName;
    private String address;
    private String email;
    private String phoneNumber;
    private String aadharNumber;
    private String panNumber;
}
