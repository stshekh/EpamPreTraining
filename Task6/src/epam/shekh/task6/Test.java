package epam.shekh.task6;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int size = 15;
        int strin = 15;
        ArrayArrays array = new ArrayArrays(new double[strin][size], -10, 10);
        array.arrayOutput();
        double testArray[][] = Arrays.copyOf(array.getArr(),array.getArr().length);
        System.out.println(array.minMaxFinder());
        System.out.println(array.averagesFinder());
        System.out.println("Position of local minimum is "+array.localMin());
        System.out.println("Position of local maximum is "+array.localMax());
        System.out.println(array.revMass());
        System.out.println(array.maxLocalMin());
    }
}
