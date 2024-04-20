package Decorator;

import Base.BasePizza;

public class ExtraCheese extends ToppingDecorator {

    BasePizza pizza;

    public ExtraCheese(BasePizza basePizza) {
        this.pizza = basePizza;
    }

    @Override
    public int cost() {
        return this.pizza.cost() + 20;
    }
}
