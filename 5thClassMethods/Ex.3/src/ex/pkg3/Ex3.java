/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex.pkg3;

/**
 *
 * @author lab801
 */
public class Ex3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        SnackBar snackBar = new SnackBar();
        
        Food lasgna = new Food(true, "lasagna", 10, "italian");
        
        snackBar.setFood(lasgna);

        System.out.println(snackBar);
    }
    
}
