package com.platform.scancenter.dto;

import lombok.Getter;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;

import java.util.Collection;

@Getter
public class CustomUserDetail extends User {

    private Long userId;

    /**
     * role
     */
    private String role;


    private String email;


    public CustomUserDetail(Long userId, String username, String password, Collection<GrantedAuthority> authorities, String role,  String email){
        super(username, password, authorities);
        this.userId = userId;
        this.role = role;
        this.email = email;
    }

    public Long getUserId() {
        return userId;
    }

    public String getRole() {
        return role;
    }

}
