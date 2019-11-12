package lt.bit.pizzeria;

class Beer implements Drink {

    private String name;
    private String type;
    private double size;
    private double price;

    public Beer(String name, String type, double size, double price) {
        this.name = name;
        this.type = type;
        this.size = size;
        this.price = price;
    }

    @Override
    public String getName() {
        return name;
    }

    public String getType() {
        return type;
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
                ", " + type +
                ", size " + size +
                "l, price " + price +
                '€';
    }
}
