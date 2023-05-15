package Factory;

import Eggs.*;

public class MagicalBag {

    public static Egg createEgg(EggType type) {
        if (type.equals(EggType.QUAIL)) {
            return new QuailEgg();
        } else if (type.equals(EggType.CHICKEN)) {
            return new ChickenEgg();
        } else if (type.equals(EggType.DINOSAUR)) {
            return new DinosaurEgg();
        } else {
            throw new IllegalArgumentException("Invalid egg type.");
        }
    }
}
