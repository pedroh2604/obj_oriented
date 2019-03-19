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
public class LightBulb {
    private float price;
    private float width;
    private float height;
    private int wattage;
    private String color;
    private String shape;
    private String brand;
    private String type;

    public LightBulb(float price, float width, float height, int wattage, String color, String shape, String brand, String type) {
        this.price = price;
        this.width = width;
        this.height = height;
        this.wattage = wattage;
        this.color = color;
        this.shape = shape;
        this.brand = brand;
        this.type = type;
    }

    @Override
    public String toString() {
        return "LightBulb{" + "price=" + price + ", width=" + width + ", height=" + height + ", wattage=" + wattage + ", color=" + color + ", shape=" + shape + ", brand=" + brand + ", type=" + type + '}';
    }

    
            
           
        
}
