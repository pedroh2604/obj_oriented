package com.PetePi;

import java.util.Scanner;

public class Main {
    static int calcalateAge(int yearOfBirth) {
        return 2019 - yearOfBirth;
    }

    static void logMe(Person me) {
        System.out.println("Hi, " + me.name);
        System.out.println("You're " + me.age + " years old.");
        System.out.println("Your national ID number is " + me.nationalId);
        System.out.println("You were born on " + me.birthday.month + "/" + me.birthday.day + "/" + me.birthday.year);
        System.out.println("You live at " + me.address.number + ", " + me.address.street);
        System.out.println("Your ZIP´Code is: " + me.address.zipCode);
        System.out.println(me.address.city + ", " + me.address.state + ". " + me.address.country);

    }
    public static void main(String[] args) {
	    Person me = new Person();
	    Address myAddress = new Address();
	    Birthday myBirthday = new Birthday();
	    Scanner scanner = new Scanner(System.in);

	    // Birthday class
        System.out.println("What's the day of your birth?");
        short dayOfBirth = scanner.nextShort();

        System.out.println("What's the month of your birth?");
        short monthOfBirth = scanner.nextShort();

        System.out.println("What's the year of your birth");
        int yearOfBirth = scanner.nextShort();

        myBirthday.day = dayOfBirth;
        myBirthday.month = monthOfBirth;
        myBirthday.year = yearOfBirth;
        me.birthday = myBirthday;

        // Person Class
        int age = calcalateAge(yearOfBirth);

        scanner = new Scanner(System.in);

        System.out.println("What's your name");
        String name = scanner.nextLine();

        System.out.println("What's your nationalId?");
        String nationalId = scanner.nextLine();

        me.age = age;
        me.name = name;
        me.nationalId = nationalId;

        // Address class
        System.out.println("What's the name of your street?");
        String street = scanner.nextLine();

        System.out.println("What's your ZIP Code?");
        String zipCode = scanner.nextLine();

        System.out.println("What's the name of your city");
        String city = scanner.nextLine();

        System.out.println("What's the name of your state?");
        String state = scanner.nextLine();

        System.out.println("What's the name of your country?");
        String country = scanner.nextLine();

        scanner = new Scanner(System.in);
        System.out.println("What's the number of your street?");
        short number = scanner.nextShort();

        myAddress.street = street;
        myAddress.number = number;
        myAddress.zipCode = zipCode;
        myAddress.city = city;
        myAddress.state = state;
        myAddress.country = country;

        me.address = myAddress;

        logMe(me);

    }
}
