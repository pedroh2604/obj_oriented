/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise1;

/**
 *
 * @author lab801
 */
public class Exercise1 {
    static int power (int a, int b) {
        int result = a;
        for (int i = 0; i < b - 1; i++) {
            result *= a;
        }
        return result;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("The result is " + power(4,9));
    }
    
}
