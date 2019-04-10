/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reviewn1;

/**
 *
 * @author lab801
 */
public class Title {
    private Position position;
    private String color;
    private String text;

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Title(Position position, String color, String text) {
        this.position = position;
        this.color = color;
        this.text = text;
    }

    @Override
    public String toString() {
        return "Title{" + "position=" + position + ", color=" + color + ", text=" + text + '}';
    }
    
    
}
