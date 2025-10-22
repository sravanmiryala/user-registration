package com.cloudawsdevops.users;

import org.junit.jupiter.api.Test;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(exclude = {DataSourceAutoConfiguration.class})
class UsersApplicationTests {

    @Test
    void contextLoads() {
    }

}
