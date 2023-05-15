import Eggs.Egg;
import Eggs.EggType;
import Observers.Basket;
import Observers.Chick;
import Singelton.EasterBunny;

public class Main {
    public static void main(String[] args) {
        EasterBunny bunny = EasterBunny.getInstance();

        Basket basket = new Basket();
        Chick chick1 = new Chick();
        basket.attach(chick1);
        Chick chick2 = new Chick();
        basket.attach(chick2);
        Chick chick3 = new Chick();
        basket.attach(chick3);

        for (int i = 0; i < 5; i++) {
            Egg egg = bunny.createEgg(EggType.CHICKEN);
            bunny.decorateEgg(egg);
            basket.addEgg(egg);
        }
    }
}