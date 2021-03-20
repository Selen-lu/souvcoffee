package com.company.souvcoffee.MS.domain.admin;

import org.springframework.security.core.GrantedAuthority;

import java.util.Collection;

public interface AdminSecuInter {

    String getUsername();
    String  getPassword();
    Collection<? extends GrantedAuthority> getAuthorities();
    boolean isAccountNonExpired();
     boolean isAccountNonLocked();
    boolean isCredentialsNonExpired();
    boolean isEnabled();
}
