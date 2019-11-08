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
        food.add(new Pizza("Aitriujų paprikų", "Kvietinių miltų pagrindas, pomidorų padažas, fermentinis sūris, pievagrybiai, saliamis, aitriosios paprikos, augalinis aliejus su česnaku", 32, 5.89));
        food.add(new Pizza("Akapulko", "Kvietinių miltų pagrindas, pomidorų padažas, fermentinis sūris, pievagrybiai, virtas jautienos kumpis, Chalapos paprikos, aštrus padažas, augalinis aliejus su česnaku", 32, 5.89));
        food.add(new Pizza("Aštrioji", "Kvietinių miltų pagrindas, pomidorų padažas, fermentinis sūris, forminis kiaulienos kumpis, saliamis, Chalapos paprikos, džiovintos aštriosios paprikos, aštrus padažas, augalinis aliejus su česnaku", 32, 5.89));
        food.add(new Pizza("Chorizo", "Kvietinių miltų pagrindas, pomidorų padažas fermentinis sūris, Chorizo dešra, aitrosios paprikos, augalinis aliejus su česnaku", 32, 5.99));
        food.add(new Wrap("Suktinukai su kumpiu", "Kvietinių miltų pagrindas, pomidorų padažas, fermentinis sūris, forminis kiaulienos kumpis, pievagrybiai, augalinis aliejus su česnaku", 4.89));
        food.add(new Wrap("Suktinukai su malta kiauliena", "Kvietinių miltų pagrindas, pomidorų padažas, fermentinis sūris, malta kiauliena, švž. paprikos, Chalapos paprikos, augalinis aliejus su česnaku", 4.89));
        food.add(new Wrap("Suktinukai su vištiena", "Kvietinių miltų pagrindas, pomidorų padažas, fermentinis sūris, vištiena, pievagrybiai, konservuotos paprikos, augalinis aliejus su česnaku", 4.89));
        food.add(new Wrap("Suktinukai vegetariški", "Kvietinių miltų pagrindas, pomidorų padažas, fermentinis sūris, pievagrybiai, konservuotos paprikos, artišokai, Salsa padažas, augalinis aliejus su česnaku", 4.89));
        food.add(new Tortilla("Tortilija su sojomis", "Kviečių tortilija įdaryta keptomis sojos lazdelėmis, graikiško tipo sūrio kubeliais, svogūnų griežinėliais, pomidorais ir traškiomis ledkalnio salotomis", 2.95));
        food.add(new Tortilla("Tortilija su vištiena", "Tortilijos su vištiena paplotėlis įdarytas juostelėmis supjaustyta vištienos file, graikiško tipo sūrio kubeliais, svogūnų griežinėliais, pomidorais, ledkalnio salotomis ir Chalapos aitriąja paprika, suteikiančia reikiamo aštrumo", 2.95));

        Iterator<Food> pizzaIterator = food.iterator();
        Iterator<Food> wrapIterator = food.iterator();
        Iterator<Food> tortillaIterator = food.iterator();
        System.out.println("PICOS");
        printFoodItems(pizzaIterator);
        System.out.println("SUKTINUKAI");
        printFoodItems(wrapIterator);
        System.out.println("TORTILIJOS");
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
