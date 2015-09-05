package com.mytech;

public class Animal {
    private final int age;

/*
    static {
        System.out.println("in com.mytech.Animal class (static) initializer block");
    }

    {
        System.out.println("in com.mytech.Animal instance initializer block");
    }
*/

    public Animal(int age) {
//        System.out.println("in com.mytech.Animal constructor");
        this.age = age;
    }

    @Override
    public int hashCode() {
        return age;
    }

    @Override
    public boolean equals(Object obj) {
        return obj != null
            && obj.getClass().getCanonicalName().equals(Animal.class.getCanonicalName())
            && ((Animal)obj).age == this.age;
    }

    public int getAge() {
        return age;
    }
}
