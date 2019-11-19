package lt.bit.pizzeria;

/*
PizzeriaMain - veiksmo vieta
 */

import java.text.SimpleDateFormat;
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

        readInputMakeList();
        scanner();
  }

    private static void scanner() {
        String clientName;
        String eat;
        String type;
        int itemNumber;
        int quantity;
        String more;
        String drink;
        String sauce;
        Sauce sauceName = null;
        String eatWhere;
        String confirmOrder;
        double bill;
        String exitOrNew;

        // SCANNER griauciai
        Date dateStart = new Date();
        String date1 = new SimpleDateFormat("EEE, d MMM yyyy HH:mm:ss").format(dateStart);
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
            while (eat.equals("yes")) { // if yes, tada klausti toliau apie maista:
                                        // if no, tada pereiti prie klausimo apie gerimus.
                System.out.println("What kind of food would you like to eat: Pizza, Wrap or Tortilla? Please choose one type.");
                type = sc.next().toLowerCase();
                for (int i = 0; i < menu.get(type).size(); i++) {
                    System.out.println((i + 1) + ": " + menu.get(type).get(i));
                }
                System.out.println("What " + type + " do you want? Please enter number.");
                itemNumber = sc.nextInt();

                System.out.println("Please enter quantity (1, 2, 3 etc.)");
                quantity = sc.nextInt();
                order.add(new Order(menu.get(type).get(itemNumber - 1).getName(), quantity, menu.get(type).get(itemNumber - 1).getPrice()));

                System.out.println("Would you like to order more food? Please enter 'yes' or 'no'.");
                more = sc.next();
                if (more.equals("yes")) {
                    eat = "yes"; // if yes, tada vel klausti apie maista.
                } else {
                    eat = "no"; // if no, tada pereiti prie klausimo apie gerimus.
                }
            }

            /*
            DRINKS
             */
            System.out.println("Would you like something to drink? Please enter 'yes' or 'no'");
            drink = sc.next();
            while (drink.equals("yes")) { // if yes, tada klausti toliau apie gerimus;
                                          // if no, tada pereiti prie klausimo apie padazus;
                System.out.println("What kind of drink would you like: beer, water, tea, coffee or soft-drink? Please choose one type.");
                type = sc.next().toLowerCase();
                for (int i = 0; i < menu.get(type).size(); i++) {
                    System.out.println((i + 1) + ": " + menu.get(type).get(i));
                }
                System.out.println("What " + type + " do you want? Please enter number.");
                itemNumber = sc.nextInt();

                System.out.println("Please enter quantity (1, 2, 3 etc.)");
                quantity = sc.nextInt();
                order.add(new Order(menu.get(type).get(itemNumber - 1).getName(), quantity, menu.get(type).get(itemNumber - 1).getPrice()));

                System.out.println("Would you like to order more drinks? Please enter 'yes' or 'no'.");
                more = sc.next();
                if (more.equals("yes")) {
                    drink = "yes"; // if yes, tada vel klausti apie gerimus.
                } else {
                    drink = "no"; // if no, tada pereiti prie klausimo apie padazus.
                }
            }


            /*
            SAUCE
             */
            System.out.println("Would you like to add some sauce? Please enter 'yes' or 'no'");
            sauce = sc.next();
            while (sauce.equals("yes")) { // if yes, tada klausiam apie padazu rusis:
                                          // if no, tada pereiti prie klausimo apie ...
                System.out.println("Please select sauce: Tabasco (T), Sriracha (S), Pesto (P), BBQ (B), Alfredo (A). " +
                        "Please enter the first letter of the sauce name: T, S, P, B or A.");
                type = sc.next();
                switch (type) {
                    case "T":
                        sauceName = Sauce.TABASCO;
                        break;
                    case "S":
                        sauceName = Sauce.SRIRACHA;
                        break;
                    case "P":
                        sauceName = Sauce.PESTO;
                        break;
                    case "B":
                        sauceName = Sauce.BBQ;
                        break;
                    case "A":
                        sauceName = Sauce.ALFREDO;
                        break;
                }

                System.out.println("Please enter quantity (1, 2, 3 etc.)");
                quantity = sc.nextInt();
                order.add(new Order(sauceName.getName(), quantity, sauceName.getPrice()));

                System.out.println("Would you like to order more sauce? Please enter 'yes' or 'no'.");
                more = sc.next();
                if (more.equals("yes")) {
                    sauce = "yes"; // IF YES, vel klausti apie padazus;
                } else {
                    sauce = "no"; // if no, tada pereiti prie klausimo apie tai, kur valgys
                }
            }

            System.out.println("Would you like to eat 1.Inside or 2.Take-away (extra charge of 0.5 eur)? Please enter '1' or '2'.");
            eatWhere = sc.next(); // If take-away, tada priskaiciuoti papildomus 0.5 eur.
            if (eatWhere.equals("1")) {
                bill = billSum(order);
            } else {
                order.add(new Order("Take-away extra charge", 1, 0.5));
                bill = billSum(order);
            }


            System.out.println("Please confirm or cancel your order. Enter 'confirm' or 'cancel'.");
            confirmOrder = sc.next();
            Date dateEnd = new Date();
            String date2 = new SimpleDateFormat("EEE, d MMM yyyy HH:mm:ss").format(dateEnd);
            if (confirmOrder.equals("confirm")) {  // if confirm, tada pereiti prie saskaitos;
                                                   // tie, kurie patvirtino uzsakyma [zr. auksciau], tada jiems pateikti saskaita:
                System.out.println("\n-------------------------\n" + date1 + "\n-------------------------");
                order.forEach(o -> System.out.println(o.toString())); // isvardinti visi pasirinkimai su kainomis
                System.out.println();
                System.out.println("Thank you for your order!\nThis is your final bill: " + bill + "eur\n"); // pateikta kaina

                System.out.println("Preliminary duration of order execution: ~60min"); // preliminarus uzsakymo ivykdymo terminas
                System.out.println("-------------------------\n" + date2 + "\n-------------------------"); // uzsakymo data ir laikas

            } else if (confirmOrder.equals("cancel")) { // if cancel, tada leisti padaryt exit ARBA formuot nauja uzsakyma nuo nulio:
                System.out.println("Would you like to exit or make a new order from scratch? Please enter 'exit' or 'new'.");
                exitOrNew = sc.next();
                if (exitOrNew.equals("exit")) { // if exit, tada:
                    System.out.println("Bye! See you next time"); // nutraukti sitoj vietoj;
                } else {
                    scanner(); // if new order, tada nukreipti zmogu i pacia pradzia, t.y. enter your name + welcome!
                }
            }
    }

    private static double billSum(List<Order> order) {
        return (double) order.stream().mapToDouble(Order::getPrice).sum();
    }

    private static void readInputMakeList() {
        try {
            List<String> menuText = Files.readAllLines(Paths.get("source/menu.txt"));
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
            menu.put("pizza", pizza);
            menu.put("wrap", wrap);
            menu.put("tortilla", tortilla);
            menu.put("beer", beer);
            menu.put("water", water);
            menu.put("soft-drink", softDrink);
            menu.put("tea", tea);
            menu.put("coffee", coffee);
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
