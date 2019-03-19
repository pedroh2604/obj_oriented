/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise5;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author lab801
 */
public class Exercise5 {
    static float calculator() {
        char operator = scanOperator();
        float num1 = scanNumber();
        float num2 = scanNumber();
        
        return switchOperation(operator, num1, num2);
        
    }
    
    static char scanOperator() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the operator: + - / * ");
        return input.next().charAt(0);
    }
    
    static float scanNumber() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        return input.nextFloat();
    }
    
    static float switchOperation(char operator, float num1, float num2) {
        switch(operator) {
            case '+':
                return sum(num1, num2);
            case '-':
                return subtraction(num1, num2);
            case '/':
                return division(num1, num2);
            case '*':
                return multiplication(num1, num2);
        }
            
   
        return num2;
    }
    
    static float sum(float num1, float num2) {
        return num1 + num2;
    }
    
    static float subtraction(float num1, float num2) {
        return num1 - num2;
    }
    
    static float multiplication(float num1, float num2) {
        return num1 * num2;
    }
    
    static float division(float num1, float num2) {
        return num1 / num2;
    }
        
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("The result is " + calculator());
 
    }
    
}
