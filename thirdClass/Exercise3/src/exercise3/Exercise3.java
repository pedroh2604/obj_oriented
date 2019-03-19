/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise3;

/**
 *
 * @author lab801
 */
public class Exercise3 {
    static void greeting(String name, int age) {
        System.out.println("Your name is: " + name + ", and you're " + age + " years old");
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String name = "Pedro";
        int age = 19;
        
        greeting(name, age);
    }
    
}
