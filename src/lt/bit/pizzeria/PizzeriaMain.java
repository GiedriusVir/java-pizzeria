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
            if (foodItem instanceof Pizza) {
                System.out.println(foodItem);
            }
        }
    }

}
