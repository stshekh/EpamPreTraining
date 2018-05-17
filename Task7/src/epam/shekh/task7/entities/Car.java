package epam.shekh.task7.entities;

public class Car {
    String model;
    int running;
    int modelYear;
    double autoPrice;
    int maxPassengers;

    public Car() {
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setAutoPrice(double autoPrice) {
        this.autoPrice = autoPrice;
    }

    public int getMaxPassengers() {
        return maxPassengers;
    }

    public void setMaxPassengers(int maxPassengers) {
        this.maxPassengers = maxPassengers;
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

    public double getAutoPrice() {
        return autoPrice;
    }

    public void setAutoPrice(int autoPrice) {
        this.autoPrice = autoPrice;
    }



}
