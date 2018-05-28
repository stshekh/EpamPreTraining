package epam.shekh.task7.logic.entities;

import java.util.Objects;

public class TaxiCar extends PassCar {

    final static String VEHICLE_TYPE = "PassCar";
    private double pricePerKilometr;

    public TaxiCar() {
        super.setType(VEHICLE_TYPE);
    }

    @Override
    public String toString() {
        return "TaxiCar{" +

                "vinCode='" + vinCode + '\'' +
                ", model='" + model + '\'' +
                ", type='" + type + '\'' +
                ", running=" + running +
                ", modelYear=" + modelYear +
                ", vehPrice=" + vehPrice +
                ", pricePerKilometr=" + pricePerKilometr +
                ", maxPassengers=" + maxPassengers +
                '}';
    }

    public TaxiCar(String vinCode, String model, int running, int modelYear, double vehPrice, int maxPassengers, String colour, int numSeats, double pricePerKilometr) {
        super(vinCode, model, running, modelYear, vehPrice, maxPassengers, colour, numSeats);
        super.setType(VEHICLE_TYPE);
        this.pricePerKilometr = pricePerKilometr;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        TaxiCar taxiCar = (TaxiCar) o;
        return pricePerKilometr == taxiCar.pricePerKilometr;
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), pricePerKilometr);
    }

    public double getPricePerKilometr() {
        return pricePerKilometr;
    }

    public void setPricePerKilometr(int pricePerKilometr) {
        this.pricePerKilometr = pricePerKilometr;
    }


}
