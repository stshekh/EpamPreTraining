package epam.shekh.task7.test;

import epam.shekh.task7.logic.container.TaxiPark;
import epam.shekh.task7.logic.entities.TaxiCar;
import epam.shekh.task7.logic.entities.Vehicle;
import epam.shekh.task7.logic.functional.CarFunctions;

public class Runner {
    public static void main(String[] args) {
        TaxiCar taxiCar1=new TaxiCar("vau123","Logan",130000,2010,30000,4,"white",5,0.3);
        TaxiCar taxiCar2=new TaxiCar("vau124","Logan",13312,2018,35000,4,"black",5,0.4);

        TaxiCar[]cars={taxiCar1,taxiCar2};

        TaxiPark taxiPark=new TaxiPark();
        taxiPark.addCar(cars);

        System.out.println("Size is "+taxiPark.size());

        CarFunctions functions=new CarFunctions();
        System.out.println("Cheapest is "+functions.findCheapestTaxi(taxiPark));
        System.out.println("Longest range is "+functions.findLongestRunning(taxiPark));
    }
}
