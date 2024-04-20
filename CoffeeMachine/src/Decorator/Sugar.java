package Decorator;

import Base.BaseCoffee;

public class Sugar implements BaseTopping{
    BaseCoffee coffee;

    public Sugar(BaseCoffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public int cost() {
        return this.coffee.cost() + 5;
    }
}
