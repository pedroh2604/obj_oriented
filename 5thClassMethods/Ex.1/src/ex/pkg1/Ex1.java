/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex.pkg1;

/**
 *
 * @author lab801
 */
public class Ex1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LightBulb lightBulb = new LightBulb();
        
        lightBulb.setOn(false);
        System.out.println(lightBulb.isOn());
        
        lightBulb.setBrightness(100);
        System.out.println("The brightness level is: " + lightBulb.getBrightness());
        
        lightBulb.increaseBrightness(20);
        System.out.println("The brightness level is: " + lightBulb.getBrightness());
        
        
        lightBulb.decreaseBrightness(30);
        System.out.println("The brightness level is: " + lightBulb.getBrightness());
        
    }
    
}
