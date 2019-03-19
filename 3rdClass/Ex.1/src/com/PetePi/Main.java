package com.PetePi;

import java.util.Scanner;

public class Main {
    static void logBirthday(Date myBirthday) {
        System.out.println("You were born on " + myBirthday.day + "/" + myBirthday.month + "/" + myBirthday.year);
    }
    public static void main(String[] args) {
	    Date myBirthday = new Date();

	    Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the day you were born");
	    short day = scanner.nextShort();

        System.out.println("Enter the month you were born");
        short month = scanner.nextShort();

        System.out.println("Enter the year you were born");
        short year = scanner.nextShort();

	    myBirthday.day = day;
	    myBirthday.year = year;
	    myBirthday.month = month;

	    logBirthday(myBirthday);
    }
}
