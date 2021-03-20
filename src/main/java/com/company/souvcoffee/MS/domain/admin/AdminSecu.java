package com.company.souvcoffee.MS.domain.admin;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class AdminSecu implements AdminSecuInter {
    public AdminSecu() { }

    private String username;
    private String userpassword;
    private List<GrantedAuthority> authorities;


    public void setUsername(String username) {
        this.username = username;
    }

    public void setUserpassword(String userpassword) {
        this.userpassword = userpassword;
    }

    public void setAuthorities(List<String> authList) { // 매개변수가 있다 !! authList
        List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
        for (int i = 0; i < authList.size(); i++) {
            authorities.add(new SimpleGrantedAuthority(authList.get(i)));
        }
        this.authorities = authorities;
    }



    @Override
    // ID
    public String getUsername() {

        return username;
    }

    @Override
    // PW
    public String getPassword() {

        return userpassword;
    }

    @Override
    // 권한
    public Collection<? extends GrantedAuthority> getAuthorities() {

        return authorities;
    }

    @Override
    // 계정이 만료 되지 않았는가?
    public boolean isAccountNonExpired() {

        return true;
    }

    @Override
    // 계정이 잠기지 않았는가?
    public boolean isAccountNonLocked() {

        return true;
    }

    @Override
    // 패스워드가 만료되지 않았는가?
    public boolean isCredentialsNonExpired() {

        return true;
    }

    @Override
    // 계정이 활성화 되었는가?
    public boolean isEnabled() {

        return true;
    }
}