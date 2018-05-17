package epam.shekh.task6;

import java.util.Arrays;
import java.util.Random;

public class ArrayArrays {

    private double arr[][];

    ArrayArrays(double arr[][], int min, int max) {
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = random.nextInt(max - min + 1) + min;
            }
        }
        this.arr = arr;
    }

    double[][] getArr() {
        return arr;
    }

    void arrayOutput() {
        for (double[] anArr : arr) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(anArr[j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    String minMaxFinder() {
        double min = Double.MAX_VALUE;
        double max = Double.MIN_VALUE;
        for (double[] anArr : arr) {
            for (int j = 0; j < arr[0].length; j++) {
                {
                    if (anArr[j] > max) {
                        max = anArr[j];
                    }
                    if (anArr[j] < min) {
                        min = anArr[j];
                    }
                }
            }
        }
        return "Max: " + max + "; \nMin " + min;
    }

    String averagesFinder() {

        double sum = 0;
        double mul = 1;
        for (double[] anArr : arr) {
            for (int j = 0; j < arr[0].length; j++) {
                {
                    sum += anArr[j];
                    mul *= anArr[j];
                }
            }
        }
        sum /= arr.length * arr[0].length;
        mul = Math.pow(mul, 1.0 / arr.length * arr[0].length);
        return "Average geometric is " + mul + "\nAver arifmetic is " + sum;
    }

    String localMin() {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr[0].length-1; j++) {
                {
                    if (arr[i][j] < arr[i][j - 1] && arr[i][j] < arr[i][j + 1])
                        return "("+i+";"+j+")";
                }

            }
        }
        return ""+-1;
    }

    String localMax() {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr[0].length-1; j++) {
                {
                    if (arr[i][j] > arr[i][j - 1] && arr[i][j] > arr[i][j + 1])
                        return "("+i+";"+j+")";
                }

            }
        }
        return ""+-1;
    }

    double [][] revMass() {
        double testArray[][] = Arrays.copyOf(arr,arr.length);

        double temp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr[0].length; j++) {
                temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        return arr;
    }

    double maxLocalMin() {
        double max=Double.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr[0].length-1; j++) {
                {
                    if (arr[i][j] < arr[i][j - 1] && arr[i][j] < arr[i][j + 1]){
                        if(arr[i][j]>max){
                            max=arr[i][j];
                        }
                    }

                }

            }
        }
        return max;
    }
}
