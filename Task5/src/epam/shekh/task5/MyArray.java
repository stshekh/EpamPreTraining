package epam.shekh.task5;

import java.util.Arrays;
import java.util.Random;


public class MyArray {
    private double arr[];

    MyArray(double arr[], int min, int max) {
        Random random = new Random();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(max - min + 1) + min;
        }
        this.arr = arr;
    }

    double[] getArr() {
        return arr;
    }

    void arrayOutput() {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    String minMaxFinder() {
        double min = Double.MAX_VALUE;
        double max = Double.MIN_VALUE;
        for (double elem : arr) {
            if (elem > max) {
                max = elem;
            }
            if (elem < min) {
                min = elem;
            }
        }
        return "Max: " + max + "; \nMin " + min;
    }

    String averagesFinder() {

        double sum = 0;
        double mul = 1;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            mul *= arr[i];
        }
        sum /= arr.length;
        mul = Math.pow(mul, 1.0 / arr.length);
        return "Average geometric is " + mul + "\nAver arifmetic is " + sum;
    }

    private boolean isUpperSorted() {
        double testArray[] = Arrays.copyOf(getArr(), getArr().length);
        Arrays.sort(testArray);
        for (int i = 0; i < testArray.length; i++) {
            if (arr[i] != testArray[i]) {
                return false;
            }
        }
        return true;
    }

    private boolean isDownSorted() {
        double testArray[] = Arrays.copyOf(getArr(), getArr().length);
        Arrays.sort(testArray);
        int k = 0;
        int j = testArray.length - 1;
        double temp;
        while (j > k) {
            temp = testArray[j];
            testArray[j] = testArray[k];
            testArray[k] = temp;
            k++;
            j--;
        }
        for (int i = 0; i < testArray.length; i++) {
            if (arr[i] != testArray[i]) {
                return false;
            }
        }
        return true;
    }

    boolean isSorted() {
        boolean b1 = isDownSorted();
        boolean b2 = isUpperSorted();
        if (b1) {
            return true;
        } else if (b2) {
            return true;
        }
        return false;
    }

    int localMin() {
        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i] < arr[i - 1] && arr[i] < arr[i + 1])
                return i;
        }
        return -1;
    }

    int localMax() {
        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1])
                return i;
        }
        return -1;
    }

    void revMass() {
        double testArray[] = Arrays.copyOf(getArr(), getArr().length);
        int i = 0;
        int j = testArray.length - 1;
        while (j > i) {
            testArray[i] = testArray[i] + testArray[j];
            testArray[j] = testArray[i] - testArray[j];
            testArray[i] = testArray[i] - testArray[j];
            i++;
            j--;
        }
        for (double elem : testArray) {
            System.out.print(elem+" ");
        }
    }

}
