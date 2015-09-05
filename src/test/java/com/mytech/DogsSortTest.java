package com.mytech;

import org.junit.Test;

import static org.junit.Assert.*;

public class DogsSortTest {
    private DogsSort ds = new DogsSort();

    @Test
    public void testSort() throws Exception {
        Dog[] dogs = new Dog[]{new Dog("haski", 5), new Dog("Dalmatin", 7),
            new Dog("sharpei", 9), new Dog("unknown", 2)};

        Dog[] expectedDogs = new Dog[]{new Dog("Dalmatin", 7), new Dog("haski", 5),
            new Dog("sharpei", 9), new Dog("unknown", 2)};

        assertArrayEquals(expectedDogs, ds.sort(dogs));
    }

    @Test
    public void testSortSameAge() throws Exception {
        Dog[] dogs = new Dog[]{new Dog("haski", 5), new Dog("Dalmatin", 7), new Dog("Ealmatin", 7),
            new Dog("sharpei", 9), new Dog("unknown", 2)};

        Dog[] expectedDogs = new Dog[]{new Dog("Dalmatin", 7), new Dog("Ealmatin", 7), new Dog("haski", 5),
            new Dog("sharpei", 9), new Dog("unknown", 2)};

        assertArrayEquals(expectedDogs, ds.sort(dogs));
    }

    @Test
    public void testSortSameBreed() throws Exception {
        Dog[] dogs = new Dog[]{new Dog("haski", 5), new Dog("Dalmatin", 7), new Dog("Dalmatin", 8),
            new Dog("sharpei", 9), new Dog("unknown", 2)};

        Dog[] expectedDogs = new Dog[]{new Dog("Dalmatin", 7), new Dog("Dalmatin", 8), new Dog("haski", 5),
            new Dog("sharpei", 9), new Dog("unknown", 2)};

        assertArrayEquals(expectedDogs, ds.sort(dogs));
    }
    @Test
    public void testSortEmpty() throws Exception {
        Dog[] dogs = new Dog[]{};

        Dog[] expectedDogs = new Dog[]{};

        assertArrayEquals(expectedDogs, ds.sort(dogs));
    }
}
