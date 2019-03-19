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
public class SnackBar {
    private Food[] food = new Food[5];
    private Drink[] drinks = new Drink[5];
    private int employees;
    private String name;
    private float latitude;
    private float longitude;
    private int capacity;
    private boolean delivery;
    private boolean driveThrough;
    private int floors;
    private String cnpj;

    public Food[] getFood() {
        return food;
    }

    public void setFood(Food[] food) {
        this.food = food;
    }

    public Drink[] getDrinks() {
        return drinks;
    }

    public void setDrinks(Drink[] drinks) {
        this.drinks = drinks;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "SnackBar{" +
                "food=" + java.util.Arrays.toString(food) +
                ", drinks=" + java.util.Arrays.toString(drinks) +
                ", employees=" + employees +
                ", name='" + name + '\'' +
                ", latitude=" + latitude +
                ", longitude=" + longitude +
                ", capacity=" + capacity +
                ", delivery=" + delivery +
                ", driveThrough=" + driveThrough +
                ", floors=" + floors +
                ", cnpj='" + cnpj + '\'' +
                '}';
    }
}
