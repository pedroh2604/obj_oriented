package com.PetePi;

public class Dog {
    String breed;
    String color;
    short age;
    String name;
    Date birthday;
    Owner owner;

    @Override
    public String toString() {
        return "Dog{" +
                "breed='" + breed + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                ", name='" + name + '\'' +
                ", birthday=" + birthday +
                ", owner=" + owner +
                '}';
    }
}
