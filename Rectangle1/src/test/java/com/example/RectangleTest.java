package com.example;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RectangleTest {

    @Test
    public void testArea() {
        Rectangle rect = new Rectangle(5, 10);
        assertEquals(50.0, rect.getArea(), 0.001);
    }

    @Test
    public void testPerimeter() {
        Rectangle rect = new Rectangle(5, 10);
        assertEquals(30.0, rect.getPerimeter(), 0.001);
    }
}