package com.testsetup;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class MainTest {
    @Test
    void greetingIsCorrect() {
        assertEquals("Hello from TestSetup!", Main.greeting());
    }
}