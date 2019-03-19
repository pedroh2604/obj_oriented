package com.PetePi;

public class Food {
    private boolean salty;
    private String name;
    private int servings;
    private String category;

    public Food(boolean salty, String name, int servings, String catgory) {
        this.salty = salty;
        this.name = name;
        this.servings = servings;
        this.category = catgory;
    }

    @Override
    public String toString() {
        return "Food{" +
                "salty=" + salty +
                ", name='" + name + '\'' +
                ", servings=" + servings +
                ", catgory='" + category + '\'' +
                '}';
    }
}
