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
public class LightBulb {
    private float price;
    private float width;
    private float height;
    private int wattage;
    private String color;
    private String brand;
    private String type;
    private boolean on;
    private double brightness;

    public double getBrightness() {
        return brightness;
    }

    public void setBrightness(double brightness) {
        this.brightness = brightness;
    }
    
    public void increaseBrightness(double brightness) {
        this.brightness += brightness;
    }
    
    public void decreaseBrightness(double brightness) {
        this.brightness -= brightness;
    }
   
    public boolean isOn() {
        if(on) {
            System.out.println("The lightbulb is on");
        } else {
            System.out.println("The lightbulb is off");
        }
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public int getWattage() {
        return wattage;
    }

    public void setWattage(int wattage) {
        this.wattage = wattage;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    
    
    
}
