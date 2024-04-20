package Decorator;

import Base.BaseCoffee;

public class Cream implements BaseTopping {
    BaseCoffee coffee;

    Cream(BaseCoffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public int cost() {
        return this.coffee.cost() + 20;
    }
}
