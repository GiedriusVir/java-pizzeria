package lt.bit.pizzeria;

/*
PizzeriaMain - veiksmo vieta
 */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

class PizzeriaMain {

    public static void main(String[] args) {

        List<Food> food = new ArrayList<>();
        food.add(new Pizza("The G.O.A.T.", "Mozzarella, spinach, goats' cheese, caramelised onions, red onions, tomatoes & balsamic drizzle", 32, 5.89));
        food.add(new Pizza("Texas Meat Meltdown", "Spicy pork, chicken breast, pepperoni, chorizo & BBQ sauce base", 32, 5.89));
        food.add(new Pizza("Hot 'N' Spicy Veg", "Triple cheese blend, peppers, jalapenos, red onions, flame roasted peppers & onions and Hut House seasoning", 32, 5.89));
        food.add(new Pizza("Margherita", "Classic mozzarella cheese & tomato sauce", 32, 5.99));
        food.add(new Wrap("Wrap with ham", "Wheat flour base, tomato sauce, rennet cheese, pork chops, champignons, vegetable oil with garlic", 4.89));
        food.add(new Wrap("Wrap with minced pork", "Wheat flour base, tomato sauce, rennet cheese, minced pork, fresh peppers, chalpa peppers, vegetable oil with garlic", 4.89));
        food.add(new Wrap("Wrap with chicken", "Wheat flour base, tomato sauce, cheese, chicken, mushrooms, canned paprika, vegetable oil with garlic", 4.89));
        food.add(new Wrap("Vegetarian wrap", "Wheat flour base, tomato sauce, cheese, champignons, canned peppers, artichokes, salsa sauce, vegetable oil with garlic", 4.89));
        food.add(new Tortilla("Tortilla with soy", "Wheat tortilla stuffed with toasted soy sticks, Greek cheese cubes, onion slices, tomatoes and iceberg crisp salad", 2.95));
        food.add(new Tortilla("Tortilla with chicken", "Chicken tortilla scones stuffed with strips of chicken fillet, Greek cheese cubes, onion slices, tomatoes, iceberg lettuce and Chalapa chili pepper", 2.95));


        List<Drink> drinks = new ArrayList<>();
        drinks.add(new Beer("New Castle", "Brown ale", 0.5, 3));
        drinks.add(new Beer("Stella Artois", "Lager", 0.5, 3));
        drinks.add(new Beer("Genys Kalifornikacija", "American pale ale", 0.5, 3.5));
        drinks.add(new Beer("Guinness", "Stout", 0.5, 4));
        drinks.add(new Water("Akvile", "gazuotas", 0.5, 1.5));
        drinks.add(new Water("Akvile", "negazuotas", 0.5, 1.5));
        drinks.add(new Water("Neptunas", "gazuotas", 0.5, 1.5));
        drinks.add(new Water("Neptunas", "negazuotas", 0.5, 1.5));
        drinks.add(new SoftDrink("Fanta",  0.5, 2));
        drinks.add(new SoftDrink("Sprite",  0.5, 2));
        drinks.add(new SoftDrink("CocaCola",  0.5, 2));
        drinks.add(new Tea("Green Tea", "sugar", 2));
        drinks.add(new Tea("Fruity Tea", "sugar", 2));
        drinks.add(new Tea("Black Tea", "milk", 2));
        drinks.add(new Tea("Black Tea", "honey", 2));
        drinks.add(new Coffee("Black Coffee", "sugar", 2));
        drinks.add(new Coffee("Flat white", "sugar", 2.5));
        drinks.add(new Coffee("Espresso", "sugar", 1.5));

        System.out.println("MENU\n");
        Iterator<Food> pizzaIterator = food.iterator();
        Iterator<Food> wrapIterator = food.iterator();
        Iterator<Food> tortillaIterator = food.iterator();
        System.out.println("PIZZA");
        printFoodItems(pizzaIterator, Pizza.class);
        System.out.println("WRAPS");
        printFoodItems(wrapIterator, Wrap.class);
        System.out.println("TORTILLIA");
        printFoodItems(tortillaIterator, Tortilla.class);

        Iterator<Drink> beerIterator = drinks.iterator();
        Iterator<Drink> waterIterator = drinks.iterator();
        Iterator<Drink> softDrinkIterator = drinks.iterator();
        Iterator<Drink> teaIterator = drinks.iterator();
        Iterator<Drink> coffeeIterator = drinks.iterator();
        System.out.println("BEERS");
        printDrinkItems(beerIterator, Beer.class);
        System.out.println("WATER");
        printDrinkItems(waterIterator, Water.class);
        System.out.println("SOFT DRINKS");
        printDrinkItems(softDrinkIterator, SoftDrink.class);
        System.out.println("TEA");
        printDrinkItems(teaIterator, Tea.class);
        System.out.println("COFFEE");
        printDrinkItems(coffeeIterator, Coffee.class);

        Sauce s1 = Sauce.TABASCO;
        System.out.println(s1);


    }

    private static void printFoodItems(Iterator<Food> iterator, Class<?> className) {
        int i = 1;
        while (iterator.hasNext()) {
            Food foodItem = iterator.next();
            if (className.isInstance(foodItem)) {
                System.out.println(i + ". " + foodItem);
                i++;
            }
        }
    }

    private static void printDrinkItems(Iterator<Drink> iterator, Class<?> className) {
        int i = 1;
        while (iterator.hasNext()) {
            Drink drinkItem = iterator.next();
            if (className.isInstance(drinkItem)) {
                System.out.println(i + ". " + drinkItem);
                i++;
            }
        }
    }

}
