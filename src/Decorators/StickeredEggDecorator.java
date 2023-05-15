package Decorators;

import Eggs.Egg;

public class StickeredEggDecorator extends Decorator {
    public StickeredEggDecorator(Egg egg) {
        super(egg);
    }

    @Override
    public void decorate() {
        super.decorate();
        System.out.println("Stickers added to egg");
    }
}
