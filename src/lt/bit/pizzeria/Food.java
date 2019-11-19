package lt.bit.pizzeria;

/*
Food - interfeisas maistui
    (galimos implementacijos: Pizza, Wrap, Tortilla ir t.t.)
 */

interface Food extends MenuItem {

    public abstract String getIngredients(); // public abstract - by default
//    double getPrice();

}
