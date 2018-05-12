package epam.shekh.Task2.ex2;

public class RingSquare {
    public static double ring(double r1, double r2) {
        if (r1 > r2) {
            return (circleSquare(r1)-circleSquare(r2));
        } else {
            return 0;
        }
    }
    private static double circleSquare(double radius){
        return Math.PI * radius * radius;
    }
}
