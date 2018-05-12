package epam.shekh.Task3.ex3;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LetterCheck {

    public static boolean method1(char c) {
        char[] letters = {'e', 'y', 'u', 'i', 'o', 'a'};
        for (char let : letters) {
            if (c == let) {
                return true;
            }
        }
        return false;
    }

    public static boolean method2(char c) {

        switch (c) {
            case 'e':

            case 'y':

            case 'u':

            case 'i':

            case 'o':

            case 'a':
                return true;

        }
        return false;
    }

    public static boolean method3(char c) {
        return c == 'a' || c == 'e' || c == 'y' || c == 'u' || c == 'i' || c == 'o';
    }

    public static boolean method4(char c) {

        Pattern pt = Pattern.compile("[eyuioa]");//pattern for vocalic letters
        Matcher mtch = pt.matcher(c + "");
        return mtch.find();
    }
}
