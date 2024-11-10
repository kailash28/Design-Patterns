package Toppings;

import decorator.BasePizza;

public class JelepinoTopings extends TopingDecorator{
    BasePizza basePizza;
    public JelepinoTopings(BasePizza basePizza){
        this.basePizza = basePizza;
    }
    @Override
    public int cost() {
       return basePizza.cost()+30;
    }
}
