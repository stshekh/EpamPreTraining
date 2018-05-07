package epam.shekh.Task2.ex4;

public class Sequences {
    private static final int ONEDIGIT = 10;

    public static boolean increasingSequence(int num) {

        int lastNum, preLastNum;
        lastNum = num % ONEDIGIT;
        num /= ONEDIGIT;
        preLastNum = num % ONEDIGIT;

        if (lastNum < preLastNum) {
            return false;
        }
        lastNum = preLastNum;

        num /= ONEDIGIT;
        preLastNum = num % ONEDIGIT;
        if (lastNum < preLastNum) {
            return false;
        } else if (preLastNum < num / 10) {
            return false;
        }

        return true;
    }

    public static boolean decreasingSequence(int num) {
        int lastNum, preLastNum;
        lastNum = num % ONEDIGIT;
        num /= ONEDIGIT;
        preLastNum = num % ONEDIGIT;

        if (lastNum > preLastNum) {
            return false;
        } else {
            lastNum = preLastNum;
        }
        num /= ONEDIGIT;
        preLastNum = num % ONEDIGIT;
        if (lastNum > preLastNum) {
            return false;
        } else if (preLastNum > num / 10) {
            return false;
        }

        return true;
    }
}
