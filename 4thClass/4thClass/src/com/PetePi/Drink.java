package com.PetePi;

public class Drink {
    private boolean alcoholic;
    private String flavor;
    private float price;
    private String name;
    private String category;

    public Drink(boolean alcoholic, String flavor, float price, String name, String category) {
        this.alcoholic = alcoholic;
        this.flavor = flavor;
        this.price = price;
        this.name = name;
        this.category = category;
    }

    @Override
    public String toString() {
        return "Drink{" +
                "alcoholic=" + alcoholic +
                ", flavor='" + flavor + '\'' +
                ", price=" + price +
                ", name='" + name + '\'' +
                ", category='" + category + '\'' +
                '}';
    }
}
