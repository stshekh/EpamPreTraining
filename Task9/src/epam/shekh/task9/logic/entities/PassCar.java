package epam.shekh.task9.logic.entities;

import java.util.Objects;

public class PassCar extends Vehicle {
    final static String VEHICLE_TYPE = "PassCar";
    private int numSeats;


    public PassCar(){
        super();
    }

    public PassCar(String vinCode, String model, int running, int modelYear, double vehPrice, int maxPassengers, String colour, int numSeats) {
        super(vinCode, model, running, modelYear, vehPrice, maxPassengers, colour);
        super.setType(VEHICLE_TYPE);
        this.numSeats = numSeats;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        PassCar passCar = (PassCar) o;
        return numSeats == passCar.numSeats;
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), numSeats);
    }

    @Override
    public String toString() {
        return "PassCar{" +
                "numSeats=" + numSeats +
                "vinCode='" + vinCode + '\'' +
                ", model='" + model + '\'' +
                ", type='" + type + '\'' +
                ", running=" + running +
                ", modelYear=" + modelYear +
                ", vehPrice=" + vehPrice +
                ", maxPassengers=" + maxPassengers +
                '}';
    }

    public int getNumSeats() {
        return numSeats;
    }

    public void setNumSeats(int numSeats) {
        this.numSeats = numSeats;
    }
}
