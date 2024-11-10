package org.main;

import Toppings.ExtraCheeseToppings;
import Toppings.JelepinoTopings;
import decorator.BasePizza;
import decorator.Margarita;
import decorator.VeggiFeast;

public class Main {
    public static void main(String[] args) {

        BasePizza basePizza = new JelepinoTopings(new ExtraCheeseToppings(new Margarita()));
        System.out.println(basePizza.cost());

        BasePizza basePizza2 = new JelepinoTopings(new ExtraCheeseToppings(new VeggiFeast()));
        System.out.println(basePizza2.cost());
    }
}