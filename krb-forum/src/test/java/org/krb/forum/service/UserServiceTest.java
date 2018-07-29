
package org.krb.forum.service;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.krb.forum.ConfigTest;
import org.krb.forum.entity.User;
import org.krb.forum.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;


public class UserServiceTest extends ConfigTest {
    
    @Autowired
    UserService userService;
    
    @Test
    @Transactional
    public void testAddNewUser() {
        User user = new User();
        user.setUsername("test");
        user.setPassword("user");
        user.setEmail("test@ema.il");
        userService.create(user);

    }
}
