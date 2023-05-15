package Singelton;

import Decorators.ColoredEggDecorator;
import Decorators.StickeredEggDecorator;
import Eggs.Egg;
import Eggs.EggType;
import Factory.MagicalBag;

import java.util.Random;

public class EasterBunny {
    private static EasterBunny bunny = null;

    private EasterBunny() {
    }

    public static EasterBunny getInstance() {
        if (bunny == null) {
            bunny = new EasterBunny();
        }
        return bunny;
    }

    public Egg createEgg(EggType type) {
        return MagicalBag.createEgg(type);
    }

    public void decorateEgg(Egg egg) {
        Random random = new Random();
        int randNumber = random.nextInt(2);
        if (randNumber == 0) {
            egg = new ColoredEggDecorator(egg);
        } else {
            egg = new StickeredEggDecorator(egg);
        }
        egg.decorate();
    }
}
