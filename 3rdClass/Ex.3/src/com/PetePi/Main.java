package com.PetePi;

import java.util.Scanner;

public class Main {
    static void logAddress(Adress myAddress) {
        System.out.println("You live at " + myAddress.number + ", " + myAddress.street);
        System.out.println("Your ZIP Code is: " + myAddress.zipCode);
        System.out.println("Your city: " + myAddress.city + ", " + myAddress.state + ". Your country: " + myAddress.country);
    }

    public static void main(String[] args) {
	    Adress myAddress = new Adress();

	    Scanner scanner = new Scanner(System.in);

        System.out.println("What's the name of your street");
        String street = scanner.nextLine();

        System.out.println("What's your ZIP code?");
        String zipCode = scanner.nextLine();

        System.out.println("What's the name of your city");
        String city = scanner.nextLine();

        System.out.println("What's the name of your state");
        String state = scanner.nextLine();

        System.out.println("What's the name of your country");
        String country = scanner.nextLine();

        scanner = new Scanner(System.in);
        System.out.println("What's the number of your house?");
        short number = scanner.nextShort();

        myAddress.street = street;
        myAddress.number = number;
        myAddress.zipCode = zipCode;
        myAddress.city = city;
        myAddress.state = state;
        myAddress.country = country;

        logAddress(myAddress);

    }
}
