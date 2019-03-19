package com.PetePi;

import java.util.Scanner;

public class Main {
    static String scanString (String string) {
        System.out.println("Enter your " + string);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    static short scanShort(String string) {
        System.out.println("Enter your: "+ string);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextShort();
    }

    static int scanInt (String string) {
        System.out.println("Enter your: " + string);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static void main(String[] args) {
        Dog dog = new Dog();
        Owner owner = new Owner();
        Date dogBirthday = new Date();
        Date ownerBirthday =  new Date();
        Address ownerAddress = new Address();

        System.out.println("Owner info");

        // OWNER
        // Address
        String street = scanString("street");
        ownerAddress.street = street;

        int number = scanInt("number");
        ownerAddress.number = number;

        String zipCode = scanString("zipCode");
        ownerAddress.zipCode = zipCode;

        String city = scanString("city");
        ownerAddress.city = city;

        String state = scanString("state");
        ownerAddress.state = state;

        String country = scanString("country");
        ownerAddress.country = country;
        owner.address = ownerAddress;

        // Birthday
        short ownerDayOfBirth = scanShort("day of birth");
        ownerBirthday.day = ownerDayOfBirth;

        short ownerMonthOfBirth = scanShort("month of birth");
        ownerBirthday.month = ownerMonthOfBirth;

        int ownerYearOfBirth = scanInt("year of birth");
        ownerBirthday.year = ownerYearOfBirth;

        owner.birthday = ownerBirthday;

        // Owner
        short ownerAge = scanShort("age");
        owner.age = ownerAge;

        String ownerName = scanString("name");
        owner.name = ownerName;

        String nationalId = scanString("national ID");
        owner.nationalId = nationalId;

        dog.owner = owner;

        // DOG

        // Birthday

        short dogDayOfBirth = scanShort("dog's day of birth");
        dogBirthday.day = dogDayOfBirth;

        short dogMonthOfBirth = scanShort("dog's month of birth");
        dogBirthday.month = dogMonthOfBirth;

        int dogYearOfBirth = scanInt("dog's year of birth");
        dogBirthday.year = dogYearOfBirth;

        dog.birthday = dogBirthday;

        String breed = scanString("dog's breed");
        dog.breed = breed;

        String color = scanString("dog's color");
        dog.color = color;

        short dogAge = scanShort("dog's age");
        dog.age = dogAge;

        String dogName = scanString("dog's name");
        dog.name = dogName;

        System.out.println(dog);

    }
}
