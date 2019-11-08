package lt.bit.pizzeria;

class Tea implements Drink {

    private String name;
    private String bonus;
    private double price;

    public Tea(String name, String bonus, double price) {
        this.name = name;
        this.bonus = bonus;
        this.price = price;
    }

    @Override
    public String getName() {
        return name;
    }

    public String getBonus() {
        return bonus;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return name +
                ", " + bonus +
                ", price " + price +
                '€';
    }
}
