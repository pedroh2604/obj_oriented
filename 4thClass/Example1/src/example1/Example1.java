/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package example1;

/**
 *
 * @author Pete π   
 */
public class Example1 {

    /**
     * @param args the command line arguments
     */
    
    static void logCharacter (Character aCharacter) {
        System.out.println("height:" + aCharacter.size.height);
        System.out.println("width:" + aCharacter.size.width);
        System.out.println("positionX:" + aCharacter.position.positionX);
        System.out.println("positionY:" + aCharacter.position.positionY);
        System.out.println("color:" + aCharacter.color);

    }
    public static void main(String[] args) {
        Character mario = new Character();
        Size size = new Size();
        size.height = 32.0f;
        size.width = 25.0f;
        
        Position position = new Position();
        position.positionX = 20.0f;
        position.positionY = 10.0f;
        
        mario.size = size;
        mario.position = position;
        mario.life = 4;
        mario.color = "red";
        
        logCharacter(mario);
    }
    
}
