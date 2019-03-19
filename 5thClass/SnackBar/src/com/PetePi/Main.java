package com.PetePi;

public class Main {

    public static void main(String[] args) {
        SnackBar snackBar = new SnackBar();

        // Food
        Food lasagna = new Food(true, "lasagna", 10, "italian");
        Food pizza = new Food(true, "pizza", 8, "italian");

        snackBar.setFood(new Food[] {lasagna, pizza});

        // Drinks
        Drink coke = new Drink(false, "regular", 5.2f, "Coke", "soft drinks");
        Drink orangeJuice = new Drink(false, "orange", 5.5f, "Orange Juice", "soft drinks");

        snackBar.setDrinks(new Drink[] {coke, orangeJuice});

        snackBar.setEmployees(30);
        snackBar.setName("Mister Lanches");
        snackBar.setLatitude(-30.5265f);
        snackBar.setLongitude(-46.5656f);
        snackBar.setCapacity(300);
        snackBar.setDelivery(true);
        snackBar.setDriveThrough(false);
        snackBar.setFloors(2);
        snackBar.setCnpj("564.789.8954-22");

        System.out.println(snackBar);
    }
}
