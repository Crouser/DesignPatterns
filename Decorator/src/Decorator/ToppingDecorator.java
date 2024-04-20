package Decorator;

import Base.BasePizza;

public abstract class ToppingDecorator extends BasePizza {
    @Override
    public abstract int cost();
}
