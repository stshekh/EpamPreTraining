package epam.shekh.Task2.ex3;

public class Changer {
    public static void exchange(int a, int b) {
        //If a=3, b=4
        a = a + b;//a=7, b=4
        b = a - b;// b=3, a=7
        a = a - b;// b=3, a=4
        System.out.println("New numbers: " + a + " " + b);
    }
}
