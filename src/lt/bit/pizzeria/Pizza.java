package lt.bit.pizzeria;

class Pizza implements Food {

    private String name;
    private String ingredients;
    private int size;
    private double price;

    Pizza(String name, String ingredients, int size, double price) {
        this.name = name;
        this.ingredients = ingredients;
        this.size = size;
        this.price = price;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getIngredients() {
        return ingredients;
    }

    public int getSize() {
        return size;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return name + "\n Sudėtis: " +
                ingredients + "\n Dydis: " + size
                + "cm. Kaina: " + price + "€";
    }

}
