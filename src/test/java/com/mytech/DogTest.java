package com.mytech;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class DogTest {

    @Test
    public void testHashCode() throws Exception {
        assertEquals("haski".hashCode(), new Dog("haski", 0).hashCode());
    }

    @Test
    public void testHashCode2() throws Exception {
        assertTrue(new Dog("haski", 2).hashCode() == new Dog("haski", 2).hashCode());
    }

    @Test
    public void testHashCode3() throws Exception {
        assertFalse(new Dog("haski", 3).hashCode() == new Dog("haski", 2).hashCode());
    }

    @Test
    public void testEquals() throws Exception {
        assertTrue(new Dog("haski", 3).equals(new Dog("haski", 3)));
    }

    @Test
    public void testNotEquals() throws Exception {
        assertFalse(new Dog("haski1", 3).equals(new Dog("haski", 3)));
    }

    @Test
    public void testNotEquals2() throws Exception {
        assertFalse(new Dog("haski1", 3).equals(new Dog("haski", 43)));
    }

    @Test
    public void testEqualsWithNull() throws Exception {
        assertFalse(new Dog("haski1", 3).equals(null));
    }

    @Test
    public void testEqualsWithDifferentType() throws Exception {
        assertFalse(new Dog("haski", 3).equals(new Animal(3)));
    }
    @Test
    public void testEqualsWithDifferentType2() throws Exception {
        assertFalse(new Animal(3).equals(new Dog("haski", 3)));
    }
}
