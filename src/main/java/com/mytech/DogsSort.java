package com.mytech;

import java.util.Arrays;

public class DogsSort {
    /**
     * Sorts dogs sorted according to internal comparator
     * @param dogs array of dogs
     * @return sorted dogs
     */
    public Dog[] sort(Dog[] dogs) {
/*
        Dog[] dogs = new Dog[]{new Dog("haski", 5), new Dog("Dalmatin", 7),
                            new Dog("sharpei", 9), new Dog("unknown", 2)};
*/
        System.out.println("unsorted: " + Arrays.toString(dogs));
        Arrays.sort(dogs, (o1, o2) -> {

            if (o1.equals(o2)) {
                return 0;
            }

            // sort according to breed, then age
            int breedComparison = o1.getBreed().compareTo(o2.getBreed());
            if (breedComparison != 0) {
                return breedComparison;
            } else {
                return o1.getAge() - o2.getAge();
            }
        });

        System.out.println("sorted: " + Arrays.toString(dogs));
        return dogs;
    }
}
