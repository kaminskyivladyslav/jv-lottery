package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Lottery lottery = new Lottery();
        Lottery lottery2 = new Lottery();
        Lottery lottery3 = new Lottery();
        Lottery[] lotteries = new Lottery[]{lottery,lottery2,lottery3};
        for (Lottery lottery0 : lotteries) {
            System.out.println(lottery0.getRandomBall());
        }
    }
}
