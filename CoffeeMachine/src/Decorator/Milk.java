package Decorator;

import Base.BaseCoffee;

public class Milk implements BaseTopping{
    BaseCoffee coffee;

    public Milk(BaseCoffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public int cost() {
        return this.coffee.cost() + 10;
    }
}
