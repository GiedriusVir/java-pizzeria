package lt.bit.pizzeria;

/*
PizzeriaMain - veiksmo vieta
 */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

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

        Iterator<Food> pizzaIterator = food.iterator();
        Iterator<Food> wrapIterator = food.iterator();
        Iterator<Food> tortillaIterator = food.iterator();
        System.out.println("PIZZA");
        printFoodItems(pizzaIterator);
        System.out.println("WRAPS");
        printFoodItems(wrapIterator);
        System.out.println("TORTILLIA");
        printFoodItems(tortillaIterator);



    }

    private static void printFoodItems(Iterator<Food> iterator) {
        while (iterator.hasNext()) {
            Food foodItem = iterator.next();
            if (foodItem instanceof Pizza) { // cia klaida!!!!!!!!!!!!!
                System.out.println(foodItem);
            }
        }
    }

}
