package lt.bit.pizzeria;

import java.text.DecimalFormat;

class Order {
    private String name;
    private int quantity;
    private double price;

    Order(String name, int quantity, double price) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return name + " x " + quantity +
                ", price: " + multiply(price, quantity) + " eur";
    }

    private static String multiply(double price, int quantity) {
        DecimalFormat dc = new DecimalFormat("#.##");
        String multiply = dc.format(price * quantity);
        return multiply;
    }
}
