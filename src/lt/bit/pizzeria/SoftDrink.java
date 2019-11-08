package lt.bit.pizzeria;

class SoftDrink implements Drink {

    private String name;
    private double size;
    private double price;

    public SoftDrink(String name, double size, double price) {
        this.name = name;
        this.size = size;
        this.price = price;
    }

    @Override
    public String getName() {
        return name;
    }

    public double getSize() {
        return size;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return name +
                ", size " + size +
                "l, price " + price +
                '€';
    }
}
