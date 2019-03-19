/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise4;

import java.util.Scanner;

/**
 *
 * @author lab801
 */
public class Exercise4 {
    static void greeting(String name, int age) {
        System.out.println("Hi, " + name + ". You're " + age + " years old.");
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter your age");
        int age = input.nextInt();
        
        input = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = input.nextLine();
        
        greeting(name, age);         
    }
    
}
