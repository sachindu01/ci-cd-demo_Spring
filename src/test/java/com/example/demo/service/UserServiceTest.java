// src/test/java/com/example/demo/service/UserServiceTest.java
package com.example.demo.service;

import com.example.demo.model.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class UserServiceTest {

    @Autowired
    private UserService service;

    @Test
    void testGetAllUsersReturnsList() {
        List<User> users = service.getAllUsers();
        assertNotNull(users);
    }


}
