/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package example1;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author lab801
 */
public class Example1 {
    static int sum(int num1, int num2) {
        return num1 + num2;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.ENGLISH);
        
        System.out.println("Enter you age");;;
        float age = input.nextFloat();
        System.out.println("You're " + age + "years old.");
        
        String name = "";
        input = new Scanner(System.in);
        System.out.println("Enter your name:    ");
        name = input.nextLine();
        System.out.println("Your name is:" + name);
        
        
        System.out.println("The result is: " + sum(7,3));
    }
    
}
