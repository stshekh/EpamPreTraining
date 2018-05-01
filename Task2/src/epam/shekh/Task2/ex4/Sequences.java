package epam.shekh.Task2.ex4;

public class Sequences {

    public static void increasingSequence(int num) {
        boolean isOk = true;
        int prevNum = 10;
        while (num > 0) {
            int curNum = num % 10;
            if (curNum < prevNum) {
                prevNum = curNum;
                num /= 10;
            } else {
                isOk = false;
                num /= 10;
            }

        }
        if (isOk) {
            System.out.println("sequence is increasing");
        } else {
            System.out.println("wrong sequence");
        }
    }
    public static void decreasingSequence(int num) {
        boolean isOk = true;
        int prevNum = -1;
        while (num > 0) {
            int curNum = num % 10;
            if (curNum > prevNum) {
                prevNum = curNum;
                num /= 10;
            } else {
                isOk = false;
                num /= 10;
            }

        }
        if (isOk) {
            System.out.println("sequence is decreasing");
        } else {
            System.out.println("wrong sequence");
        }
    }
}
