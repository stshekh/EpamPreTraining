package epam.shekh.task9.logic.functional;

import epam.shekh.task9.logic.entities.TaxiCar;

public class Sorter {
    //bubble sort by model year
    public static TaxiCar[] bubbleSorter(TaxiCar[] taxiCars) {
        TaxiCar temp = null;
        for (int i = 0; i < taxiCars.length; i++) {
            for (int j = 1; j < (taxiCars.length - i); j++) {
                if (taxiCars[j - 1].getModelYear() > taxiCars[j].getModelYear()) {
                    //swap elements
                    temp = taxiCars[j - 1];
                    taxiCars[j - 1] = taxiCars[j];
                    taxiCars[j] = temp;
                }
            }
        }
        return taxiCars;
    }

    //insertion sort by pricePerKilometr
    public static TaxiCar[] insertionSorter(TaxiCar[] taxiCars) {
        TaxiCar temp = null;
        for (int i = 1; i < taxiCars.length; i++) {
            for (int j = i; j > 0 && taxiCars[j - 1].getPricePerKilometr() > taxiCars[j].getPricePerKilometr(); j--) {
                temp = taxiCars[j - 1];
                taxiCars[j - 1] = taxiCars[j];
                taxiCars[j] = temp;
            }
        }
        return taxiCars;
    }

    //selection sort by car price
    public static TaxiCar[] selectionSorter(TaxiCar[] taxiCars) {
        for (int i = 0; i < taxiCars.length - 1; i++) {
            int index = i;
            for (int j = i + 1; j < taxiCars.length; j++)
                if (taxiCars[j].getVehPrice() < taxiCars[index].getVehPrice())
                    index = j;

            TaxiCar smallerPriceCar= taxiCars[index];
            taxiCars[index] = taxiCars[i];
            taxiCars[i] = smallerPriceCar;
        }
        return taxiCars;
    }

    //quick sort by running of the car
    public static void quickSort(TaxiCar []taxiCars) {
        int startIndex = 0;
        int endIndex = taxiCars.length - 1;
        doSort(startIndex, endIndex, taxiCars);
    }

    private static void doSort(int start, int end, TaxiCar[] taxiCars) {
        if (start >= end)
            return;
        int i = start, j = end;
        int cur = i - (i - j) / 2;
        while (i < j) {
            while (i < cur && (taxiCars[i].getRunning() <= taxiCars[cur].getRunning())) {
                i++;
            }
            while (j > cur && (taxiCars[cur].getRunning() <= taxiCars[j].getRunning())) {
                j--;
            }
            if (i < j) {
                TaxiCar temp = taxiCars[i];
                taxiCars[i] = taxiCars[j];
                taxiCars[j] = temp;
                if (i == cur)
                    cur = j;
                else if (j == cur)
                    cur = i;
            }
        }
        doSort(start, cur,taxiCars);
        doSort(cur+1, end,taxiCars);
    }
}
