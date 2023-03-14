package com.user.integratedusermanagementapi.user.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Setter
@Getter
@Entity
@NoArgsConstructor
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "external_key", nullable = false, unique=true)
    private String external_key;

    @Column(name = "username", nullable = true, length = 20,unique=true)
    private String username;

    @Column(name = "nick_name", nullable = true, length = 20, unique=true)
    private String nickName;

    @Column(name = "mobile_phone_number", nullable = false, length = 20)
    private String mobilePhoneNumber;

    @Column(name = "password", nullable = true, length = 60)
    private byte[] password;
}
