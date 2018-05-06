package epam.shekh.Task2.ex2;

public class RingSquare {
    public static void ring(double r1, double r2) {
        if (r1 > r2) {
            System.out.println("Radius of the ring is: " + (circleSquare(r1)-circleSquare(r2)));
        } else {
            System.out.println("You entered R1<R2.\n Try again!");
        }
    }
    private static double circleSquare(double radius){
        return Math.PI * radius * radius;
    }
}
