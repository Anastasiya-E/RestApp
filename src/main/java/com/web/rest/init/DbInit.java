package com.web.rest.init;


import org.springframework.stereotype.Component;
import com.web.rest.entity.Role;
import com.web.rest.entity.User;
import com.web.rest.service.RoleServiceImpl;
import com.web.rest.service.UserServiceImpl;

import javax.annotation.PostConstruct;
import java.util.Set;

@Component
public class DbInit {
    private final UserServiceImpl userService;
    private final RoleServiceImpl roleService;

    public DbInit(UserServiceImpl userService, RoleServiceImpl roleService) {
        this.userService = userService;
        this.roleService = roleService;
    }
    @PostConstruct
    private void postConstruct() {
        Role roleAdmin = new Role((long)1,"ADMIN");
        Role roleUser = new Role( (long)2,"USER");
        roleService.addRole(roleAdmin);
        roleService.addRole(roleUser);

        User user = new User("user@mail.ru", "user", "user", "userov", 20, Set.of(roleUser));
        User admin = new User("admin@mail.ru", "admin", "admin", "adminov", 30, Set.of(roleAdmin, roleUser));
        userService.addUser(user);
        userService.addUser(admin);
    }
}
