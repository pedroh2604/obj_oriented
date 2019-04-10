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
public class SearchInput {
    private String text;
    private Size size;
    private String font;
    private String color;
    private Position position;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Size getSize() {
        return size;
    }

    public String getFont() {
        return font;
    }

    public String getColor() {
        return color;
    }

    public Position getPosition() {
        return position;
    }

    public SearchInput(String text, Size size, String font, String color, Position position) {
        this.text = text;
        this.size = size;
        this.font = font;
        this.color = color;
        this.position = position;
    }

    @Override
    public String toString() {
        return "SearchInput{" + "text=" + text + ", size=" + size + ", font=" + font + ", color=" + color + ", position=" + position + '}';
    }
    
    
}
