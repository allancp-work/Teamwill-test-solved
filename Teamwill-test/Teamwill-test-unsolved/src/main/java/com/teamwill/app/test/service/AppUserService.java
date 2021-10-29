package com.teamwill.app.test.service;

import com.teamwill.app.test.entity.AppUser;
import com.teamwill.app.test.entity.Role;

import java.util.List;

public interface AppUserService {

    AppUser saveUser(AppUser appUser);
    Role saveRole(Role role);
    void addRoleToAppUser(String username, String roleName);
    AppUser getUser(String username);
    List<AppUser> getAppUsers();
}
