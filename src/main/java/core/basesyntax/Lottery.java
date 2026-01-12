package core.basesyntax;

import java.util.Random;

public class Lottery {
    private final ColorSupplier supplier = new ColorSupplier();
    private final Random random = new Random();

    public Ball getRandomBall() {
        final int maxNumber = 100;
        return new Ball(supplier.getRandomColor(), random.nextInt(maxNumber));

    }
}
