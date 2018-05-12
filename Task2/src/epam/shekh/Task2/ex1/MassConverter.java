package epam.shekh.Task2.ex1;

public class MassConverter {
    private static final int MASSPOWER = 1000;

    public static double miligramConvert(double kilo) {
        return kilo * MASSPOWER * MASSPOWER;
    }

    public static double gramConvert(double kilo) {
        return kilo * MASSPOWER;
    }

    public static double toneConvert(double kilo) {
        return kilo / MASSPOWER;
    }
}
