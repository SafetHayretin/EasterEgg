package Decorators;

import Eggs.Egg;

public abstract class Decorator implements Egg {
    protected Egg egg;

    public Decorator(Egg egg) {
        this.egg = egg;
    }

    @Override
    public void decorate() {
        egg.decorate();
    }
}
