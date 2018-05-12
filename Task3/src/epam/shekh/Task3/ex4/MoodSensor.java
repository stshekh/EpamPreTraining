package epam.shekh.Task3.ex4;


public class MoodSensor {
    private static final String MOOD1 = ":)";
    private static final String MOOD2 = ":(";
    private static final String MOOD3 = "=D";
    private static final String MOOD4 = ";(";

    public static String myMood() {
        String s = "My current mood is: ";
        int a = (int) (Math.random() * 4);

        switch (a) {
            case 0:
                s += MOOD1;
                break;
            case 1:
                s += MOOD2;
                break;
            case 2:
                s += MOOD3;
                break;
            case 3:
                s += MOOD4;
                break;
        }
        return s;
    }
}
