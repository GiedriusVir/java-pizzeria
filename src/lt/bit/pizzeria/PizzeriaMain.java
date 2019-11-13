package lt.bit.pizzeria;

/*
PizzeriaMain - veiksmo vieta
 */

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

class PizzeriaMain {

    public static void main(String[] args) {

//        List<MenuItem> menuItems = new ArrayList<>();
//        menuItems.add(new Pizza("The G.O.A.T.", "Mozzarella, spinach, goats' cheese, caramelised onions, red onions, tomatoes & balsamic drizzle", 32, 5.89));
//        menuItems.add(new Pizza("Texas Meat Meltdown", "Spicy pork, chicken breast, pepperoni, chorizo & BBQ sauce base", 32, 5.89));
//        menuItems.add(new Pizza("Hot 'N' Spicy Veg", "Triple cheese blend, peppers, jalapenos, red onions, flame roasted peppers & onions and Hut House seasoning", 32, 5.89));
//        menuItems.add(new Pizza("Margherita", "Classic mozzarella cheese & tomato sauce", 32, 5.99));
//        menuItems.add(new Wrap("Wrap with ham", "Wheat flour base, tomato sauce, rennet cheese, pork chops, champignons, vegetable oil with garlic", 4.89));
//        menuItems.add(new Wrap("Wrap with minced pork", "Wheat flour base, tomato sauce, rennet cheese, minced pork, fresh peppers, chalpa peppers, vegetable oil with garlic", 4.89));
//        menuItems.add(new Wrap("Wrap with chicken", "Wheat flour base, tomato sauce, cheese, chicken, mushrooms, canned paprika, vegetable oil with garlic", 4.89));
//        menuItems.add(new Wrap("Vegetarian wrap", "Wheat flour base, tomato sauce, cheese, champignons, canned peppers, artichokes, salsa sauce, vegetable oil with garlic", 4.89));
//        menuItems.add(new Tortilla("Tortilla with soy", "Wheat tortilla stuffed with toasted soy sticks, Greek cheese cubes, onion slices, tomatoes and iceberg crisp salad", 2.95));
//        menuItems.add(new Tortilla("Tortilla with chicken", "Chicken tortilla scones stuffed with strips of chicken fillet, Greek cheese cubes, onion slices, tomatoes, iceberg lettuce and Chalapa chili pepper", 2.95));
//        menuItems.add(new Beer("New Castle", "Brown ale", 0.5, 3));
//        menuItems.add(new Beer("Stella Artois", "Lager", 0.5, 3));
//        menuItems.add(new Beer("Genys Kalifornikacija", "American pale ale", 0.5, 3.5));
//        menuItems.add(new Beer("Guinness", "Stout", 0.5, 4));
//        menuItems.add(new Water("Akvile", "gazuotas", 0.5, 1.5));
//        menuItems.add(new Water("Akvile", "negazuotas", 0.5, 1.5));
//        menuItems.add(new Water("Neptunas", "gazuotas", 0.5, 1.5));
//        menuItems.add(new Water("Neptunas", "negazuotas", 0.5, 1.5));
//        menuItems.add(new SoftDrink("Fanta",  0.5, 2));
//        menuItems.add(new SoftDrink("Sprite",  0.5, 2));
//        menuItems.add(new SoftDrink("CocaCola",  0.5, 2));
//        menuItems.add(new Tea("Green Tea", "sugar", 2));
//        menuItems.add(new Tea("Fruity Tea", "sugar", 2));
//        menuItems.add(new Tea("Black Tea", "milk", 2));
//        menuItems.add(new Tea("Black Tea", "honey", 2));
//        menuItems.add(new Coffee("Black Coffee", "sugar", 2));
//        menuItems.add(new Coffee("Flat white", "sugar", 2.5));
//        menuItems.add(new Coffee("Espresso", "sugar", 1.5));

//        System.out.println("MENU\n");
//        Iterator<MenuItem> pizzaIterator = menuItems.iterator();
//        Iterator<MenuItem> wrapIterator = menuItems.iterator();
//        Iterator<MenuItem> tortillaIterator = menuItems.iterator();
//        Iterator<MenuItem> beerIterator = menuItems.iterator();
//        Iterator<MenuItem> waterIterator = menuItems.iterator();
//        Iterator<MenuItem> softDrinkIterator = menuItems.iterator();
//        Iterator<MenuItem> teaIterator = menuItems.iterator();
//        Iterator<MenuItem> coffeeIterator = menuItems.iterator();
//        System.out.println("PIZZA");
//        printMenuItems(pizzaIterator, Pizza.class);
//        System.out.println("WRAPS");
//        printMenuItems(wrapIterator, Wrap.class);
//        System.out.println("TORTILLIA");
//        printMenuItems(tortillaIterator, Tortilla.class);
//        System.out.println("BEERS");
//        printMenuItems(beerIterator, Beer.class);
//        System.out.println("WATER");
//        printMenuItems(waterIterator, Water.class);
//        System.out.println("SOFT DRINKS");
//        printMenuItems(softDrinkIterator, SoftDrink.class);
//        System.out.println("TEA");
//        printMenuItems(teaIterator, Tea.class);
//        System.out.println("COFFEE");
//        printMenuItems(coffeeIterator, Coffee.class);
//
//        Sauce s1 = Sauce.TABASCO;
//        System.out.println(s1);
        readInputMakeList();

    }

    private static void printMenuItems(Iterator<MenuItem> iterator, Class<?> className) {
        int i = 1;
        while (iterator.hasNext()) {
            MenuItem menuItem = iterator.next();
            if (className.isInstance(menuItem)) {
                System.out.println(i + ". " + menuItem);
                i++;
            }
        }
    }

    private static void readInputMakeList() {

        try {
            List<String> menuText = Files.readAllLines(Paths.get("source/menu.txt"));
            Map<String, List<MenuItem>> menu = new TreeMap<>();
            List<MenuItem> pizza = new ArrayList<>();
            List<MenuItem> wrap = new ArrayList<>();
            List<MenuItem> tortilla = new ArrayList<>();
            List<MenuItem> beer = new ArrayList<>();
            List<MenuItem> water = new ArrayList<>();
            List<MenuItem> softDrink = new ArrayList<>();
            List<MenuItem> tea = new ArrayList<>();
            List<MenuItem> coffee = new ArrayList<>();
            String[] item = new String[]{};
            for (String line: menuText) {
                item = line.split("\\+");
                switch (item[0]) {
                    case "Pizza": {
                        Pizza menuItem = new Pizza(item[1], item[2], Integer.parseInt(item[3]), Double.parseDouble(item[4]));
                        pizza.add(menuItem);
                        break;
                    }
                    case "Wrap": {
                        Wrap menuItem = new Wrap(item[1], item[2], Double.parseDouble(item[3]));
                        wrap.add(menuItem);
                        break;
                    }
                    case "Tortilla": {
                        Tortilla menuItem = new Tortilla(item[1], item[2], Double.parseDouble(item[3]));
                        tortilla.add(menuItem);
                        break;
                    }
                    case "Beer": {
                        Beer menuItem = new Beer(item[1], item[2], Double.parseDouble(item[3]), Double.parseDouble(item[4]));
                        beer.add(menuItem);
                        break;
                    }
                    case "Water": {
                        Water menuItem = new Water(item[1], item[2], Double.parseDouble(item[3]), Double.parseDouble(item[4]));
                        water.add(menuItem);
                        break;
                    }
                    case "SoftDrink": {
                        SoftDrink menuItem = new SoftDrink(item[1], Double.parseDouble(item[2]), Double.parseDouble(item[3]));
                        softDrink.add(menuItem);
                        break;
                    }
                    case "Tea": {
                        Tea menuItem = new Tea(item[1], item[2], Double.parseDouble(item[3]));
                        tea.add(menuItem);
                        break;
                    }
                    case "Coffee": {
                        Coffee menuItem = new Coffee(item[1], item[2], Double.parseDouble(item[3]));
                        coffee.add(menuItem);
                        break;
                    }
                }
            }
            menu.put("Pizza", pizza);
            menu.put("Wrap", wrap);
            menu.put("Tortilla", tortilla);
            menu.put("Beer", beer);
            menu.put("Water", water);
            menu.put("Soft Drink", softDrink);
            menu.put("Tea", tea);
            menu.put("Coffee", coffee);
            for (Map.Entry<String, List<MenuItem>> entry : menu.entrySet()) {
                String key = entry.getKey();
                List<MenuItem> values = entry.getValue();
                System.out.println(key);
                for (MenuItem value: values) {
                    System.out.println(value);
                }
                System.out.println();
            }
//            System.out.println(menu.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
