package com.mytech;

public class Dog extends Animal {
    private final String breed;

/*
    static {
        System.out.println("in com.mytech.Dog class (static) initializer block");
    }

    {
        System.out.println("in com.mytech.Dog instance initializer block");
    }
*/

    public Dog(String breed, int age) {
        super(age);
/*
        System.out.println("just checkin");
        System.out.println("in com.mytech.Dog constructor");
*/
        this.breed = breed;
    }

    @Override
    public int hashCode() {       // 32 = 2^5, 2^32, 2^32 - 1, 2^5 * 2^17
        return breed.hashCode() + (31 ^ breed.length()) * this.getAge();
    }

    @Override
    public boolean equals(Object obj) {
        return obj != null
            && Dog.class.getCanonicalName().equals(obj.getClass().getCanonicalName())
            && this.breed.equals(((Dog)obj).breed)
            && this.getAge() == ((Dog) obj).getAge();
    }

    public String getBreed() {
        return breed;
    }

    @Override
    public String toString() {
        return "breed="+ breed
            + ";age=" + getAge();
    }
}


