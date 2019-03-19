package com.PetePi;

import java.util.Scanner;

public class Main {
    static void logMyDogInfo (Dog myDog) {
        System.out.println("Some info about your dog");
        System.out.println("It's a " + myDog.breed);
        System.out.println("It's " + myDog.age + " years old");
        System.out.println("It's called " + myDog.name + ". Such a cuttie");
        System.out.println(" Your dog was born on " +  myDog.birth.day + "/" + +  myDog.birth.month + "/" + +  myDog.birth.year);
        System.out.println("Congrats! Your lil dog rocks :)");
    }
    public static void main(String[] args) {
	    Dog myDog = new Dog();
        Scanner scanner = new Scanner(System.in);

        // Reads the input from the user
        System.out.println("What's your dog's breed?");
        String breed= scanner.nextLine();

        System.out.println("What's your dog's color?");
        String color = scanner.nextLine();

        System.out.println("Whats's your dog's name");
        String name = scanner.nextLine();

        // avoids keyboard buffer errors
        scanner = new Scanner(System.in);

        System.out.println("What's your dog's age?");
        short age = scanner.nextShort();

        System.out.println("What day of the month was your dog born?");
        short dayOfBirth = scanner.nextShort();

        System.out.println("What month was your dog born?");
        short monthOfBirth = scanner.nextShort();

        System.out.println("What year was your dog born?");
        short yearOfBirth = scanner.nextShort();


        // sets the Date class
        Date myDogBirthInfo = new Date();
        myDogBirthInfo.day = dayOfBirth;
        myDogBirthInfo.month = monthOfBirth;
        myDogBirthInfo.year = yearOfBirth;

        // sets the Dog class
        myDog.breed = breed;
        myDog.color = color;
        myDog.age = age;
        myDog.name = name;
        myDog.birth = myDogBirthInfo;

        logMyDogInfo(myDog);

    }
}
