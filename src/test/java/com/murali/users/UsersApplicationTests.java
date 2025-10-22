package com.cloudawsdevops.users;

import com.cloudawsdevops.users.repositories.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

@SpringBootTest
class UsersApplicationTests {

    // Mock the repository so Spring can autowire UserService without a real DB
    @MockBean
    private UserRepository userRepository;

    @Test
    void contextLoads() {
    }

}
