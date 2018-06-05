package epam.shekh.task9.logic.functional;

import epam.shekh.task9.logic.entities.TaxiCar;
import epam.shekh.task9.logic.container.TaxiPark;

public class Searcher {

    //usage of linear searcher to find cheapest taxi
    public static TaxiCar linearSearcher(TaxiPark carList) {
        double min = 999999999;
        TaxiCar minCar = null;
        for (int i = 0; i < carList.size(); i++) {
            if (carList.get(i).getPricePerKilometr() < min) {
                min = carList.get(i).getPricePerKilometr();
                minCar = carList.get(i);
            }
        }
        return minCar;
    }

    //binary search to find a taxi car with entered model year
    public static int binarySearcher(TaxiCar[] taxiCars, int value) {
        int left = 0;
        int right = taxiCars.length;
        int middle;
        while (left < right) {
            middle = (left + right) / 2;
            if (value == taxiCars[middle].getModelYear()) {
                return middle;
            } else {
                if (value < taxiCars[middle].getModelYear()) {
                    right = middle;
                } else {
                    left = middle + 1;
                }
            }
        }
        return -1;
    }
}


