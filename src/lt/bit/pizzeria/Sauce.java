package lt.bit.pizzeria;

import java.util.Scanner;

/*
NOTE: Enum constructor must have private or package scope. You cannot use the public access modifier.
 */

public enum Sauce implements Food {
    TABASCO ("Tabasco", 0.8),
    SRIRACHA("Sriracha", 1.2),
    PESTO("Pesto", 1.0),
    BBQ("Bbq", 0.7),
    ALFREDO("Alfredo", 1.1);
    

    private final String name;
    private final double price;
    Sauce(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getIngredients() {
        return null;
    }

    @Override
    public double getPrice() {
        return price;
    }
}


