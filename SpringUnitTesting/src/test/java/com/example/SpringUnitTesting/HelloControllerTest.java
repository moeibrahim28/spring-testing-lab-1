package com.example.SpringUnitTesting;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HelloControllerTest {

    @Test
    void hello() {
        HelloController helloController = new HelloController();
        String name = "Jamie";
        assertEquals("Hello " + name, helloController.hello(name));
    }

}