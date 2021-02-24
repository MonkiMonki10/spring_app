package com.main.bicboc.domain;

import org.springframework.security.core.GrantedAuthority;

public enum Role implements GrantedAuthority {
    User, Admin;

    @Override
    public String getAuthority() {
        return name();
    }
}
