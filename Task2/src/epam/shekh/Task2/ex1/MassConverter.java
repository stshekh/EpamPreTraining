package epam.shekh.Task2.ex1;

public class MassConverter {
    public static void massConvert(double kilo) {
        System.out.println("Milligrams: " + kilo * 1000000);
        System.out.println("Gramms: " + kilo * 1000);
        System.out.println("Tones: " + kilo / 1000);
    }
}
