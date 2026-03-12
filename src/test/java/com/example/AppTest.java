package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests for App class
 */
public class AppTest {
    
    @Test
    public void testAdd() {
        assertEquals(5, App.add(2, 3));
        assertEquals(0, App.add(-1, 1));
        assertEquals(100, App.add(50, 50));
    }
    
    @Test
    public void testSubtract() {
        assertEquals(1, App.subtract(3, 2));
        assertEquals(-2, App.subtract(1, 3));
        assertEquals(0, App.subtract(5, 5));
    }
    
    @Test
    public void testGreet() {
        assertEquals("Hello, World!", App.greet("World"));
        assertEquals("Hello, CI/CD!", App.greet("CI/CD"));
        assertEquals("Hello, !", App.greet(""));
    }
}
