package epam.shekh.task9.logic.container;

import epam.shekh.task9.logic.entities.TaxiCar;

import java.util.Arrays;

public class TaxiPark {
    private TaxiCar[] cars;
    private int amount;

    public TaxiPark() {
        this.cars = new TaxiCar[amount];
    }

    public TaxiPark(TaxiPark vehList) {
        cars = vehList.cars;
    }

    public void addCar(TaxiCar... newCars) {
        int previousAmount = amount;
        amount += newCars.length;
        cars = Arrays.copyOf(cars, amount);

        for (int i = 0; i < newCars.length; i++) {
            cars[i + previousAmount] = newCars[i];
        }

    }

    public void removeCar(int taxiId) {
        if (taxiId < amount) {
            int removedElement = amount - taxiId - 1;
            if (removedElement > 0)
                System.arraycopy(cars, taxiId + 1, cars, taxiId, removedElement);
            cars[--amount]=null;
        }
    }

    public int size(){
        return amount;
    }

    public TaxiCar get(int id){
        if(id<amount)
        return cars[id];
        return null;
    }

}
