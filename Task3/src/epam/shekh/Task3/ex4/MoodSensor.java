package epam.shekh.Task3.ex4;

import java.util.Random;

public class MoodSensor {
    public static void myMood() {
        String s = "My current mood is: ";
        int a = (int) (Math.random() * 4);

        switch (a) {
            case 0:
                s += ":)";
                break;
            case 1:
                s += ":(";
                break;
            case 2:
                s += "=D";
                break;
            case 3:
                s += "=;(";
                break;
            default:
                break;
        }
        System.out.println(s);
    }
}
