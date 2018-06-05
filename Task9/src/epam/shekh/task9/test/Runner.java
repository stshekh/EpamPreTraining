package epam.shekh.task9.test;

import epam.shekh.task9.logic.container.TaxiPark;
import epam.shekh.task9.logic.entities.TaxiCar;
import epam.shekh.task9.logic.functional.CarFunctions;
import epam.shekh.task9.logic.functional.Printer;
import epam.shekh.task9.logic.functional.Searcher;
import epam.shekh.task9.logic.functional.Sorter;

public class Runner {
    public static void main(String[] args) {
        TaxiCar taxiCar1 = new TaxiCar("vau123", "Logan", 130000, 2010, 30000, 4, "white", 5, 0.3);
        TaxiCar taxiCar2 = new TaxiCar("vau124", "Logan", 13312, 2018, 35000, 4, "black", 5, 0.4);
        TaxiCar taxiCar3 = new TaxiCar("vau125", "Polo", 30000, 2017, 19000, 4, "blue", 5, 0.35);
        TaxiCar taxiCar4 = new TaxiCar("vau126", "Passat", 250000, 2009, 45000, 4, "silver", 5, 0.19);

        TaxiCar[] cars = {taxiCar1, taxiCar2, taxiCar3, taxiCar4};

        //bubble sort by model year
        TaxiCar[] sortetCars = Sorter.bubbleSorter(cars);
        for (TaxiCar sortetCar : sortetCars) {
            Printer.print(sortetCar);
        }
        Printer.print("----------------------");
        Printer.print(Searcher.binarySearcher(sortetCars,2009));

        Printer.print("----------------------");
        sortetCars = Sorter.selectionSorter(cars);
        for (TaxiCar sortetCar : sortetCars) {
            Printer.print(sortetCar);
        }



        TaxiPark taxiPark = new TaxiPark();
        taxiPark.addCar(cars);

        Printer.print("----------------------");
        Printer.print("Cheapest taxi in taxipark is:\n"+Searcher.linearSearcher(taxiPark));



        System.out.println("Size is " + taxiPark.size());

        CarFunctions functions = new CarFunctions();
        System.out.println("Cheapest is " + functions.findCheapestTaxi(taxiPark));
        System.out.println("Longest range is " + functions.findLongestRunning(taxiPark));
    }
}
