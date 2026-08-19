package com.transvault.dto.users;

import lombok.Data;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
public class UserResponseDto {
    private UUID userId;
    private String userName;
    private String password;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private boolean isActive;
    private String remarks;

    private String firstName;
    private String lastName;
    private String address;
    private String email;
    private String phoneNumber;
    private String aadharNumber;
    private String panNumber;
}
