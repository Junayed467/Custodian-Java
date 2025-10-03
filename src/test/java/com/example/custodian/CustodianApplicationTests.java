package com.example.custodian;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(properties = "spring.profiles.active=test")
class CustodianApplicationTests {

    @Test
    void contextLoads() {
        // boots the Spring context
    }
}
