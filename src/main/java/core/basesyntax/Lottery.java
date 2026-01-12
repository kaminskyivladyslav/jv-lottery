package core.basesyntax;

import java.util.Random;

public class Lottery {
    public Ball getRandomBall() {
        ColorSupplier supplier = new ColorSupplier();
        Colors color = supplier.getRandomColor();
        int number = new Random().nextInt(101);
        return new Ball(color,number);
    }
}

