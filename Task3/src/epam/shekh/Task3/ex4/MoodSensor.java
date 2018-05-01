package epam.shekh.Task3.ex4;

import java.util.Random;

public class MoodSensor {
    public static void myMood() {
        String s = "My current mood is: ";
        int a = (int) (Math.random() * 4);

        switch (a) {
            case 0:
                s += "\uD83D\uDE04";
                break;
            case 1:
                s += "\uD83D\uDE12";
                break;
            case 2:
                s += "\uD83D\uDE14";
                break;
            case 3:
                s += "\uD83D\uDE06";
                break;
            default:
                break;
        }
        System.out.println(s);
    }
}
