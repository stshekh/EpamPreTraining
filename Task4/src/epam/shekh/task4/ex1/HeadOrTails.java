package epam.shekh.task4.ex1;

import java.util.Random;

public class HeadOrTails {

    public int coinThrower(int attempts) {
        int head=0;
        Random random = new Random();
        for (int i = 0; i < attempts; i++) {
            if (random.nextBoolean()) {
                head++;
            }
        }
        return head;
    }
}
