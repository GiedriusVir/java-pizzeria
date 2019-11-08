package lt.bit.pizzeria;

class Wrap implements Food {

    private String name;
    private String ingredients;
    private double price;

    Wrap(String name, String ingredients, double price) {
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
        return name + "\n Ingredients: " +
                ingredients + "\n Price: " + price + "€";
    }
}
