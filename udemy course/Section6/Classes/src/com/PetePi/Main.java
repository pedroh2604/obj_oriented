package com.PetePi;

import java.util.Scanner;

public class Main {

    static String scanName () {
        System.out.println("Please, enter your name: ");
        Scanner input  = new Scanner(System.in);
        String name = input.nextLine();
        return name;
    }

    static void greeting (String name) {
        System.out.println("Hello, " + name + ". Welcome to my calculator");
    }

    static float scanNumber(int number) {
        System.out.println("Please, enter number " + number + ":");
        Scanner input = new Scanner(System.in);
        float scannedNumber = input.nextFloat();
        return scannedNumber;
    }

    static char scanOperator () {
        System.out.println("Enter an operator: + - * /");
        Scanner input = new Scanner(System.in);
        char opeator = input.next().charAt(0);
        return opeator;
    }

    static float addNumber(float a, float b) {
        return a + b;
    }

    static float subtractNumber(float a, float b) {
        return a - b;
    }

    static float multiplyNumber(float a, float b) {
        return a * b;
    }

    static float divideNumber(float a, float b) {
        return a / b;
    }

    static float calculator(char operator, float number1, float number2) {
        float result;

        switch (operator) {
            case '+':
                result = addNumber(number1, number2);
                break;
            case '-':
                result = subtractNumber(number1, number2);
                break;
            case '*':
                result = multiplyNumber(number1, number2);
                break;
            case '/':
                result = divideNumber(number1, number2);
                break;
            default:
                System.out.println("Invalid operator");
                result = 0;
                break;
        }
        return result;
    }

    static void printResult (float result) {
        System.out.println("The result is: " + result);
    }


    public static void main(String[] args) {
        String name = scanName();
        greeting(name);
        float number1 = scanNumber(1);
        float number2 = scanNumber(2);
        char operator = scanOperator();
        float result = calculator(operator, number1, number2);
        printResult(result);

    }
}
