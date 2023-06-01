package com.web.rest.service;

import com.web.rest.entity.Role;

import java.util.List;

public interface RoleService {
    List<Role> getAllRoles();

    void deleteRoleById(Long id);

    void addRole(Role role);

}

