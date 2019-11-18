package lt.bit.pizzeria;

/*
PizzeriaMain - veiksmo vieta
 */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

class PizzeriaMain {

    private static TreeMap<String, List<MenuItem>> menu;

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
        scanner();
  }

    private static void scanner() {
        String clientName;
        String eat;
        String typeEat;
        int itemNumber;
        int quantityF;
        String moreEat;
        String drink;
        String typeDrink;
        int quantityD;
        String moreDrink;
        String sauce;
        String typeSauce;
        int quantityS;
        String moreSauce;

        // SCANNER griauciai
        List<Order> order = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

            System.out.println("Enter your name and press 'enter'");
            clientName = sc.nextLine();
            System.out.println("Dear " + clientName + "! Welcome to our pizzeria. Please make your choice.");

            /*
            FOOD
             */
            System.out.println("Would you like to eat something? Please enter 'yes' or 'no'");
            eat = sc.next();
            while (eat.equals("yes")) {
                // if no, tada pereiti prie klausimo apie gerimus.
                // if yes, tada klausti toliau apie maista:

                System.out.println("What kind of food would you like to eat: Pizza, Wrap or Tortilla? Please choose one type.");
                typeEat = sc.next();
                for (int i = 0; i < menu.get(typeEat).size(); i++) {
                    System.out.println((i + 1) + ": " + menu.get(typeEat).get(i));
                }
                System.out.println("What " + typeEat.toLowerCase() + " do you want? Please enter number.");
                itemNumber = sc.nextInt();

                System.out.println("Please enter quantity (1, 2, 3 etc.)");
                quantityF = sc.nextInt();
                order.add(new Order(menu.get(typeEat).get(itemNumber - 1).getName(), quantityF, 4.89));

                System.out.println("Would you like to order more food? Please enter 'yes' or 'no'.");
                moreEat = sc.next();
                if (moreEat.equals("yes")) {
                    eat = "yes";
                } else {
                    eat = "no";
                }
                // if no, tada pereiti prie klausimo apie gerimus.
                // if yes, tada vel klausti apie maista.
            }

            /*
            DRINKS
             */
            System.out.println("Would you like something to drink? Please enter 'yes' or 'no'");
            drink = sc.next();
            while (drink.equals("yes")) {
                // if no, tada pereiti prie klausimo apie padazus;
                // if yes, tada klausti toliau apie gerimus;

                System.out.println("What kind of drink would you like: beer, water, tea, coffee or soft drink? Please choose one type.");
                typeDrink = sc.next();
                for (int i = 0; i < menu.get(typeDrink).size(); i++) {
                    System.out.println((i + 1) + ": " + menu.get(typeDrink).get(i));
                }
                System.out.println("What " + typeDrink.toLowerCase() + " do you want? Please enter number.");
                itemNumber = sc.nextInt();

                System.out.println("Please enter quantity (1, 2, 3 etc.)");
                quantityD = sc.nextInt();
                order.add(new Order(menu.get(typeDrink).get(itemNumber - 1).getName(), quantityD, 4.89));

                System.out.println("Would you like to order more drinks? Please enter 'yes' or 'no'.");
                moreDrink = sc.next();
                if (moreDrink.equals("yes")) {
                    drink = "yes";
                } else {
                    drink = "no";
                }
                    // if no, tada pereiti prie klausimo apie padazus.
                    // if yes, tada vel klausti apie gerimus.
            }


            /*
            SAUCE
             */
            System.out.println("Would you like to add some sauce? Please enter 'yes' or 'no'");
            sauce = sc.next();
            while (sauce.equals("yes")) {
                // if no, tada pereiti prie klausimo apie ...
                // if yes, tada klausiam apie padazu rusis:
                System.out.println("Please select sauce: Tabasco (T), Sriracha (S), Pesto (P), BBQ (B), Alfredo (A). " +
                        "Please enter the first letter of the sauce name: T, S, P, B or A.");
                typeSauce = sc.next();
                for (int i = 0; i < menu.get(typeSauce).size(); i++) {
                    System.out.println((i + 1) + ": " + menu.get(typeSauce).get(i));
                }
                System.out.println("What " + typeSauce.toLowerCase() + " do you want? Please enter number.");
                itemNumber = sc.nextInt();

                System.out.println("Please enter quantity (1, 2, 3 etc.)");
                quantityS = sc.nextInt();
                order.add(new Order(menu.get(typeSauce).get(itemNumber - 1).getName(), quantityS, 4.89));

                System.out.println("Would you like to order more sauce? Please enter 'yes' or 'no'.");
                moreSauce = sc.next();
                if (moreSauce.equals("yes")) {
                    sauce = "yes";
                } else {
                    sauce = "no";
                }
                // if no, tada pereiti prie klausimo apie tai, kur valgys
                // IF YES, vel klausti apie padazus;
            }

            String eatWhere;
            System.out.println("Would you like to eat 1.Inside or 2.Take-away (extra charge of 0.5 eur)? Please enter '1' or '2'.");
            eatWhere = sc.next();
            // If take-away, tada priskaiciuoti papildomus 0.5 eur.

            String confirmOrder;
            System.out.println("Please confirm or cancel your order. Enter 'confirm' or 'cancel'.");
            confirmOrder = sc.next();
            //if confirm, tada pereiti prie saskaitos;
            // if cancel, tada leisti padaryt exit ARBA formuot nauja uzsakyma nuo nulio:
            if (confirmOrder.equals("confirm")) {
                // tie, kurie patvirtino uzsakyma [zr. auksciau], tada jiems pateikti saskaita:
//            double bill; // sukurti apskaiciavima saskaitos
//            System.out.println("Thank you for your order! This is your final bill: " + bill); //[isvardinti visus pasirinkimus su kainomis +
                // pateikti kaina + uzsakymo data ir laikas + preliminarus uzsakymo ivykdymo terminas].
            } else if (confirmOrder.equals("cancel")) {
                String exitOrNew;
                System.out.println("Would you like to exit or make a new order from scratch? Please enter 'exit' or 'new'.");
                exitOrNew = sc.next();
                // if exit, tada:
                if (exitOrNew.equals("exit")) {
                    System.out.println("Bye! See you next time"); // nutraukti sitoj vietoj;
                } else {
                    scanner(); // if new order, tada nukreipti zmogu i pacia pradzia, t.y. enter your name + welcome!
                }
            }

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
//            Map<String, List<MenuItem>> menu = new TreeMap<>();
            menu = new TreeMap<>();
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
//                System.out.println(key);
                for (MenuItem value: values) {
//                    System.out.println(value);
                }
            }
//            System.out.println(menu.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
