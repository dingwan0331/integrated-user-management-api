package com.user.integratedusermanagementapi.base.entity;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@MappedSuperclass
public abstract class BaseEntityWithExternalKey extends BaseEntity {
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "external_key", nullable = false, unique=true, length = 200)
    private String external_key;
}
