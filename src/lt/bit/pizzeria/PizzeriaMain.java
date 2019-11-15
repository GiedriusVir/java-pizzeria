package lt.bit.pizzeria;

/*
PizzeriaMain - veiksmo vieta
 */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

class PizzeriaMain<clientName> {

    public static void main(String[] args) {

        List<MenuItem> menuItems = new ArrayList<>();
        menuItems.add(new Pizza("The G.O.A.T.", "Mozzarella, spinach, goats' cheese, caramelised onions, red onions, tomatoes & balsamic drizzle", 32, 5.89));
        menuItems.add(new Pizza("Texas Meat Meltdown", "Spicy pork, chicken breast, pepperoni, chorizo & BBQ sauce base", 32, 5.89));
        menuItems.add(new Pizza("Hot 'N' Spicy Veg", "Triple cheese blend, peppers, jalapenos, red onions, flame roasted peppers & onions and Hut House seasoning", 32, 5.89));
        menuItems.add(new Pizza("Margherita", "Classic mozzarella cheese & tomato sauce", 32, 5.99));
        menuItems.add(new Wrap("Wrap with ham", "Wheat flour base, tomato sauce, rennet cheese, pork chops, champignons, vegetable oil with garlic", 4.89));
        menuItems.add(new Wrap("Wrap with minced pork", "Wheat flour base, tomato sauce, rennet cheese, minced pork, fresh peppers, chalpa peppers, vegetable oil with garlic", 4.89));
        menuItems.add(new Wrap("Wrap with chicken", "Wheat flour base, tomato sauce, cheese, chicken, mushrooms, canned paprika, vegetable oil with garlic", 4.89));
        menuItems.add(new Wrap("Vegetarian wrap", "Wheat flour base, tomato sauce, cheese, champignons, canned peppers, artichokes, salsa sauce, vegetable oil with garlic", 4.89));
        menuItems.add(new Tortilla("Tortilla with soy", "Wheat tortilla stuffed with toasted soy sticks, Greek cheese cubes, onion slices, tomatoes and iceberg crisp salad", 2.95));
        menuItems.add(new Tortilla("Tortilla with chicken", "Chicken tortilla scones stuffed with strips of chicken fillet, Greek cheese cubes, onion slices, tomatoes, iceberg lettuce and Chalapa chili pepper", 2.95));
        menuItems.add(new Beer("New Castle", "Brown ale", 0.5, 3));
        menuItems.add(new Beer("Stella Artois", "Lager", 0.5, 3));
        menuItems.add(new Beer("Genys Kalifornikacija", "American pale ale", 0.5, 3.5));
        menuItems.add(new Beer("Guinness", "Stout", 0.5, 4));
        menuItems.add(new Water("Akvile", "gazuotas", 0.5, 1.5));
        menuItems.add(new Water("Akvile", "negazuotas", 0.5, 1.5));
        menuItems.add(new Water("Neptunas", "gazuotas", 0.5, 1.5));
        menuItems.add(new Water("Neptunas", "negazuotas", 0.5, 1.5));
        menuItems.add(new SoftDrink("Fanta",  0.5, 2));
        menuItems.add(new SoftDrink("Sprite",  0.5, 2));
        menuItems.add(new SoftDrink("CocaCola",  0.5, 2));
        menuItems.add(new Tea("Green Tea", "sugar", 2));
        menuItems.add(new Tea("Fruity Tea", "sugar", 2));
        menuItems.add(new Tea("Black Tea", "milk", 2));
        menuItems.add(new Tea("Black Tea", "honey", 2));
        menuItems.add(new Coffee("Black Coffee", "sugar", 2));
        menuItems.add(new Coffee("Flat white", "sugar", 2.5));
        menuItems.add(new Coffee("Espresso", "sugar", 1.5));

        System.out.println("MENU\n");
        Iterator<MenuItem> pizzaIterator = menuItems.iterator();
        Iterator<MenuItem> wrapIterator = menuItems.iterator();
        Iterator<MenuItem> tortillaIterator = menuItems.iterator();
        Iterator<MenuItem> beerIterator = menuItems.iterator();
        Iterator<MenuItem> waterIterator = menuItems.iterator();
        Iterator<MenuItem> softDrinkIterator = menuItems.iterator();
        Iterator<MenuItem> teaIterator = menuItems.iterator();
        Iterator<MenuItem> coffeeIterator = menuItems.iterator();
        System.out.println("PIZZA");
        printMenuItems(pizzaIterator, Pizza.class);
        System.out.println("WRAPS");
        printMenuItems(wrapIterator, Wrap.class);
        System.out.println("TORTILLIA");
        printMenuItems(tortillaIterator, Tortilla.class);
        System.out.println("BEERS");
        printMenuItems(beerIterator, Beer.class);
        System.out.println("WATER");
        printMenuItems(waterIterator, Water.class);
        System.out.println("SOFT DRINKS");
        printMenuItems(softDrinkIterator, SoftDrink.class);
        System.out.println("TEA");
        printMenuItems(teaIterator, Tea.class);
        System.out.println("COFFEE");
        printDrinkItems(coffeeIterator, Coffee.class);

        Sauce s1 = Sauce.TABASCO;
        System.out.println(s1);


        scanner();
  }

    private  static void scanner() {
        // SCANNER griauciai
        Scanner sc = new Scanner(System.in);
            String clientName;
            System.out.println("Enter your name and press 'enter'");
            clientName = sc.nextLine();
            System.out.println("Dear " + clientName + "! Welcome to our pizzeria. Please make your choice.");

            String eat;
            System.out.println("Would you like to eat something? Please enter yes or no");
            eat = sc.nextLine();
            // if no, tada pereiti prie klausimo apie gerimus.
            // if yes, tada klausti toliau apie maista:

            String typeEat;
            System.out.println("What kind of food would you like to eat: pizza, wrap or tortilla? Please choose one type.");
            typeEat = sc.nextLine();

            int quantityF;
            System.out.println("Please enter quantity (1, , 2, 3 etc.)");
            quantityF = sc.nextInt();

            String moreEat;
            System.out.println("Would you like to order more food? Please enter yes or no.");
            moreEat = sc.nextLine();
            // if no, tada pereiti prie klausimo apie gerimus.
            // if yes, tada vel klausti apie maista.

            String drink;
            System.out.println("Would you like something to drink? Please enter yes or no");
            drink = sc.nextLine();
            // if no, tada pereiti prie klausimo apie padazus;
            // if yes, tada klausti toliau apie gerimus;

            String typeDrink;
            System.out.println("What kind of drink would you like: beer, water, tea, coffee or soft drink? Please choose one type.");
            typeDrink = sc.nextLine();

            int quantityD;
            System.out.println("Please enter quantity (1, , 2, 3 etc.)");
            quantityD = sc.nextInt();

            String moreDrink;
            System.out.println("Would you like to order more drinks? Please enter yes or no.");
            moreDrink = sc.nextLine();
            // if no, tada pereiti prie klausimo apie padazus.
            // if yes, tada vel klausti apie gerimus.

            String sauce;
            System.out.println("Would you like to add some sauce? Please enter yes or no");
            sauce = sc.nextLine();
            // if no, tada pereiti prie klausimo apie ...
            // if yes, tada klausiam apie padazu rusis:

            String typeSauce;
            System.out.println("Please select sauce: Tabasco (T), Sriracha (S), Pesto (P), BBQ (B), Alfredo (A). " +
                "Please enter the first letter of the sauce name: T, S, P, B or A.");
            typeSauce = sc.nextLine();

            int quantityS;
            System.out.println("Please enter quantity (1, 2, 3 etc.)");
            quantityS = sc.nextInt();

            String moreSauce;
            System.out.println("Would you like to order more sauce? Please enter yes or no.");
            moreSauce = sc.nextLine();
            // if no, tada pereiti prie klausimo apie tai, kur valgys
            // IF YES, vel klausti apie padazus;

            String eatWhere;
            System.out.println("Would you like to eat 1.Inside or 2.Take-away (extra charge of 0.5 eur)? Please enter 1 or 2.");
            eatWhere = sc.nextLine();
            // If take-away, tada priskaiciuoti papildomus 0.5 eur.

            String confirmOrder;
            System.out.println("Please confirm or cancel your order. Enter confirm or cancel.");
            confirmOrder = sc.nextLine();
            //if confirm, tada pereiti prie saskaitos;
            // if cancel, tada leisti padaryt exit ARBA formuot nauja uzsakyma nuo nulio:
            String exitOrNew;
            System.out.println("Would you like to exit or make a new order from scratch? Please enter exit or new.");
            exitOrNew = sc.nextLine();
            // if exit, tada:
            System.out.println("Bye! See you next time"); // nutraukti sitoj vietoj;
            // if new order, tada nukreipti zmogu i pacia pradzia, t.y. enter your name + welcome!

            // tie, kurie patvirtino uzsakyma [zr. auksciau], tada jiems pateikti saskaita:
            double bill; // sukurti apskaiciavima saskaitos
            System.out.println("Thank you for your order! This is your final bill: " + bill); //[isvardinti visus pasirinkimus su kainomis +
            // pateikti kaina + uzsakymo data ir laikas + preliminarus uzsakymo ivykdymo terminas].

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

//    private static void printDrinkItems(Iterator<MenuItem> iterator, Class<?> className) {
//        int i = 1;
//        while (iterator.hasNext()) {
//            MenuItem drinkItem = iterator.next();
//            if (className.isInstance(drinkItem)) {
//                System.out.println(i + ". " + drinkItem);
//                i++;
//            }
//        }
//    }

}
