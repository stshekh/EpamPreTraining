package epam.shekh.Task2.ex1;

public class MassConverter {
    private static final int MASSPOWER = 1000;

    public static void massConvert(double kilo) {
        System.out.println("Milligrams: " + kilo * MASSPOWER * MASSPOWER);
        System.out.println("Gramms: " + kilo * MASSPOWER);
        System.out.println("Tones: " + kilo / MASSPOWER);
    }
}
