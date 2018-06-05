package epam.shekh.task9.logic.entities;

import java.util.Objects;

public abstract class Vehicle {

    String vinCode;
    String model;
    String type;
    int running;
    int modelYear;
    double vehPrice;
    int maxPassengers;

    public Vehicle(String vinCode, String model, int running, int modelYear, double vehPrice, int maxPassengers, String colour) {
        this.vinCode = vinCode;
        this.model = model;
        this.running = running;
        this.modelYear = modelYear;
        this.vehPrice = vehPrice;
        this.maxPassengers = maxPassengers;
    }

    public Vehicle() {

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vehicle vehicle = (Vehicle) o;
        return running == vehicle.running &&
                modelYear == vehicle.modelYear &&
                Double.compare(vehicle.vehPrice, vehPrice) == 0 &&
                maxPassengers == vehicle.maxPassengers &&
                Objects.equals(vinCode, vehicle.vinCode) &&
                Objects.equals(model, vehicle.model) &&
                Objects.equals(type, vehicle.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vinCode, model, type, running, modelYear, vehPrice, maxPassengers);
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "vinCode='" + vinCode + '\'' +
                ", model='" + model + '\'' +
                ", type='" + type + '\'' +
                ", running=" + running +
                ", modelYear=" + modelYear +
                ", vehPrice=" + vehPrice +
                ", maxPassengers=" + maxPassengers +
                '}';
    }

    public String getVinCode() {

        return vinCode;
    }

    public void setVinCode(String vinCode) {
        this.vinCode = vinCode;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getRunning() {
        return running;
    }

    public void setRunning(int running) {
        this.running = running;
    }

    public int getModelYear() {
        return modelYear;
    }

    public void setModelYear(int modelYear) {
        this.modelYear = modelYear;
    }

    public double getVehPrice() {
        return vehPrice;
    }

    public void setVehPrice(double vehPrice) {
        this.vehPrice = vehPrice;
    }

    public int getMaxPassengers() {
        return maxPassengers;
    }

    public void setMaxPassengers(int maxPassengers) {
        this.maxPassengers = maxPassengers;
    }
}
