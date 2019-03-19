/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex.pkg4;

/**
 *
 * @author lab801
 */
public class Ex4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SnackBar snackBar = new SnackBar();
        
        snackBar.setName("my Bar");
        String myName = snackBar.getName();
        System.out.println(myName);
    }
    
}
