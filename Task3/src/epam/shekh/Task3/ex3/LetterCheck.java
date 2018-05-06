package epam.shekh.Task3.ex3;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LetterCheck {

    public static void method1(char c) {
        boolean isOk = false;
        char[] letters = {'e', 'y', 'u', 'i', 'o', 'a'};
        for (char let : letters) {
            if (c == let) {
                isOk = true;
            }
        }
        if (isOk) {
            System.out.println("Letter " + c + " is vocalic");
        }
    }

    public static void method2(char c) {
        boolean isOk = false;
        switch (c) {
            case 'e':

            case 'y':

            case 'u':

            case 'i':

            case 'o':

            case 'a':
                isOk = true;
                break;

        }
        if (isOk) {
            System.out.println("Letter " + c + " is vocalic");
        }
    }

    public static void method3(char c) {
        boolean isOk = false;
        if (c == 'a' || c == 'e' || c == 'y' || c == 'u' || c == 'i' || c == 'o') {
            isOk = true;
        }
        if (isOk){
            System.out.println("Letter " + c + " is vocalic");
        }

    }

    public static void method4(char c) {

        Pattern pt = Pattern.compile("[eyuioa]");//pattern for vocalic letters
        Matcher mtch = pt.matcher(c+"");
        if(mtch.find())
            System.out.println("Letter " + c + " is vocalic");

    }
}
