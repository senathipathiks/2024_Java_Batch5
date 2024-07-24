package com.supraja.restapp;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class StudentsbRestApplnApplicationTests {

	@Test
    void contextLoads() {
        // Add an assertion here
        assertTrue(true, "This test should always pass");
        System.out.println("Run Success");
    }
}
