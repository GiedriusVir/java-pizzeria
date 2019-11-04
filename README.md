# [Pizzeria]

**Tikslas:** sukurti picos užsakymo sistemą.

## Užduoties aprašymas

Paleidus programą klientas turi pasirinkti iš meniu, ką norės užsisakyti.
Jam parodomas picų/padažų/gėrimų sąrašas su kainomis.
Meniu (arba jo dalis) turi būti nuskaitomas iš tekstinio failo ir surikiuotas pagal pavadinimą arba kainas (rikiuojama ne faile, o vykdymo metu).
Po pasirinkimo apskaičiuojama galutinė užsakymo suma.
Klientas turi turėti galimybę atsisakyti arba formuoti užsakymą iš naujo.
T.y. užsakymas nėra vykdomas kol negaunamas patvirtinimas.
Po patvirtinimo, klientui atspausdinama sąskaita su užsakytais produktais.
Čekyje turi būti užsakymo data ir laikas. Taip pat preliminarus vykdymo terminas (pvz. +10 min).

## Techninė dalis

- PizzeriaMain - veiksmo vieta

- MenuItem - interfeisas arba abstrakti klasė maistui

- Drink - interfeisas arba abstrakti klasė gėrimams (galimos implementacijos: Beer, Water (still, sparkling), SoftDrink, 
Tea (sugar, honey), Coffee (sugar, milk) ir t.t.)

- Food - interfeisas maistui (galimos implementacijos: Pizza, Wrap, Tortilla ir t.t.)

- Sauce - enumas

### Authors
[Diana](https://github.com/Dialiu), [Greta](https://github.com/Gretata), [Giedrius](https://github.com/GiedriusVir)
