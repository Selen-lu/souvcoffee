package com.company.souvcoffee.MS.service.ms;

import com.company.souvcoffee.MS.domain.admin.AdminSecu;

public interface UserLoginService {
    AdminSecu loadUserByUsername(String inputUserId);

}
