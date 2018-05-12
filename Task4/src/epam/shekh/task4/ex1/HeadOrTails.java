package epam.shekh.task4.ex1;

import java.util.Random;

public class HeadOrTails {
    private int head, tails;

    public int coinThrower(int attempts) {
        Random random = new Random();
        boolean a = random.nextBoolean();
        for (int i = 0; i < attempts; i++) {
            if (a) {
                head++;
            }
        }
        return head;
    }
}
