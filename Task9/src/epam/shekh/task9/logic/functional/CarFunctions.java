package epam.shekh.task9.logic.functional;


import epam.shekh.task9.logic.container.TaxiPark;
import epam.shekh.task9.logic.entities.TaxiCar;

public class CarFunctions {
    public TaxiCar findCheapestTaxi(TaxiPark carList) {
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

    public TaxiCar findLongestRunning(TaxiPark carList) {
        int max = 0;
        TaxiCar maxRunningCar = null;
        for (int i = 0; i < carList.size(); i++) {
            if (carList.get(i).getRunning() > max) {
                max = carList.get(i).getRunning();
                maxRunningCar = carList.get(i);
            }
        }
        return maxRunningCar;
    }
}
