package Decorators;

import Eggs.Egg;

public class ColoredEggDecorator extends Decorator {
    public ColoredEggDecorator(Egg egg) {
        super(egg);
    }

    @Override
    public void decorate() {
        super.decorate();
        System.out.println("Egg was painted");
    }
}
