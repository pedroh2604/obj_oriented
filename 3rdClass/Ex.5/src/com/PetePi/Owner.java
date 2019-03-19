package com.PetePi;

public class Owner {
    short age;
    String name;
    String nationalId;
    Address address;
    Date birthday;

    @Override
    public String toString() {
        return "Owner{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", nationalId='" + nationalId + '\'' +
                ", address=" + address +
                ", birthday=" + birthday +
                '}';
    }
}
