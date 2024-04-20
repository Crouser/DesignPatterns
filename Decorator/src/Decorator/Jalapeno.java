package Decorator;

import Base.BasePizza;

public class Jalapeno extends ToppingDecorator{
    BasePizza basePizza;

    public Jalapeno(BasePizza Pizza) {
        this.basePizza = Pizza;
    }
    @Override
    public int cost() {
        return this.basePizza.cost() + 30;
    }
}
