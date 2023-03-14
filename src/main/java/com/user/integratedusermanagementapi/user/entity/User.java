package com.user.integratedusermanagementapi.user.entity;

import com.user.integratedusermanagementapi.base.entity.BaseEntityWithExternalKey;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@Entity
@NoArgsConstructor
@Table(name = "users")
public class User extends BaseEntityWithExternalKey {
    @Column(name = "username", nullable = true, length = 20,unique=true)
    private String username;

    @Column(name = "nick_name", nullable = false, length = 20, unique=true)
    private String nickName;

    @Column(name = "mobile_phone_number", nullable = false, length = 20)
    private String mobilePhoneNumber;

    @Column(name = "password", nullable = true, length = 60)
    private byte[] password;
}
