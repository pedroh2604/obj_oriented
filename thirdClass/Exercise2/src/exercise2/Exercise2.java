/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise2;

import java.util.Scanner;

/**
 *
 * @author lab801
 */
public class Exercise2 {
    static boolean isEven(int num) {
        return (num % 2 == 0);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        
        int number = input.nextInt();
        System.out.println("Even: " + isEven(number));
    }
    
}
