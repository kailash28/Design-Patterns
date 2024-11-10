package Toppings;

import decorator.BasePizza;

public class ExtraCheeseToppings extends TopingDecorator{
    BasePizza basePizza ;

    public ExtraCheeseToppings(BasePizza basePizza){
        this.basePizza = basePizza;
    }
    @Override
    public int cost() {
        return basePizza.cost()+15;
    }
}
