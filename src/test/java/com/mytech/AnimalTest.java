package com.mytech;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class AnimalTest {

    @Test
    public void testEquals() throws Exception {
        new Animal(5);
        assertTrue(new Animal(5).equals(new Animal(5)));
    }
    @Test
    public void testEqualsNot() throws Exception {
        new Animal(5);
        assertFalse(new Animal(3).equals(new Animal(5)));
    }
    @Test
    public void testEqualsNull() throws Exception {
        new Animal(5);
        assertFalse(new Animal(3).equals(null));
    }
    @Test
    public void testEqualsWrongType() throws Exception {
        new Animal(5);
        assertFalse(new Animal(3).equals(new Object()));
    }

    @Test
    public void testHashCode() {
        assertEquals(5, new Animal(5).hashCode());
    }
}
