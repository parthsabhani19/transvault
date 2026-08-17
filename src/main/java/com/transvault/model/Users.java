package com.transvault.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
@Entity
@Table(name = "users")
public class Users {
    @Id
    @Column(name = "usereid")
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID userid;

    @Column(name = "firstname", nullable = false)
    private String firstName;
    @Column(name = "lastname", nullable = false)
    private String lastName;
    @Column(name = "username", nullable = false, unique = true)
    private String userName;

    @Column(name = "password", nullable = false)
    private String password;

    @Column(name = "address", nullable = false)
    private String address;
    @Column(name = "email", nullable = false, unique = true)
    private String email;
    @Column(name = "phone", nullable = false, unique = true)
    private String phoneNumber;

    @Column(name = "created", nullable = false)
    private LocalDateTime createdAt;
    @Column(name = "updated", nullable = false)
    private LocalDateTime updatedAt;

    @Column(name = "aadhar")
    private String aadharNumber;
    @Column(name = "pan")
    private String panNumber;

    @Column(name = "active", nullable = false)
    private boolean isActive;
    @Column(name = "remark")
    private String remarks;
}
