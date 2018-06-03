package exercise2;


import java.util.concurrent.ThreadLocalRandom;

public class Lotto

{
    int[] integerGenerated;

    Lotto() {


        integerGenerated = new int[3];
        integerGenerated[0] = ThreadLocalRandom.current().nextInt(3, 9);
        integerGenerated[1] = ThreadLocalRandom.current().nextInt(3, 9);

        integerGenerated[2] = ThreadLocalRandom.current().nextInt(3, 9);

    }

    public int[] getRandomNumber() {

        return this.integerGenerated;

    }
}
