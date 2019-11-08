package lt.bit.pizzeria;

/*
Food - interfeisas maistui
    (galimos implementacijos: Pizza, Wrap, Tortilla ir t.t.)
 */

interface Food {

    public abstract String getName(); // public abstract - by default
    String getIngredients();
    double getPrice();

}
