package lt.bit.pizzeria;

class Tortilla implements Food {

    private String name;
    private String ingredients;
    private double price;

    public Tortilla(String name, String ingredients, double price) {
        this.name = name;
        this.ingredients = ingredients;
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

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return name + "\n Sudėtis: " +
                ingredients + "\n Kaina: " + price + "€";
    }
}
