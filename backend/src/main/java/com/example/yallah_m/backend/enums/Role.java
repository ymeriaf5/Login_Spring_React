package com.example.yallah_m.backend.enums;

import org.springframework.security.core.GrantedAuthority;

public enum Role implements GrantedAuthority {
    ADMIN,
    DRIVER,
    USER;

    @Override
    public String getAuthority() {
        return this.name();
    }
}