package lt.bit.pizzeria;

/*
Drink - interfeisas arba abstrakti klasė gėrimams
    (galimos implementacijos:
        Beer,
        Water (still, sparkling),
        SoftDrink,
        Tea (sugar, honey),
        Coffee (sugar, milk) ir t.t.)
 */


interface Drink { // reikės pasirinkti abstrakti klasė ar interfeisas

    public abstract String getName(); // public abstract - by default
    double getPrice();

}
