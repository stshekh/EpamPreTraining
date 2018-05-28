package epam.shekh.task7.logic.entities;

import java.util.Objects;

public class TripInfo {
    private long tripId;
    private TaxiCar taxiCar;
    private double tripBill;
    private int tripDistance;
    private int tripTime;

    public TripInfo(long tripId, TaxiCar taxiCar, double tripBill, int tripDistance, int tripTime) {
        this.tripId = tripId;
        this.taxiCar = taxiCar;
        this.tripBill = tripBill;
        this.tripDistance = tripDistance;
        this.tripTime = tripTime;
    }

    public TripInfo() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TripInfo tripInfo = (TripInfo) o;
        return tripId == tripInfo.tripId &&
                Double.compare(tripInfo.tripBill, tripBill) == 0 &&
                tripDistance == tripInfo.tripDistance &&
                tripTime == tripInfo.tripTime &&
                Objects.equals(taxiCar, tripInfo.taxiCar);
    }

    @Override
    public int hashCode() {

        return Objects.hash(tripId, taxiCar, tripBill, tripDistance, tripTime);
    }

    @Override
    public String toString() {
        return "TripInfo{" +
                "tripId=" + tripId +
                ", taxiCar=" + taxiCar +
                ", tripBill=" + tripBill +
                ", tripDistance=" + tripDistance +
                ", tripTime=" + tripTime +
                '}';
    }

    public long getTripId() {
        return tripId;
    }

    public void setTripId(long tripId) {
        this.tripId = tripId;
    }

    public TaxiCar getTaxiCar() {
        return taxiCar;
    }

    public void setTaxiCar(TaxiCar taxiCar) {
        this.taxiCar = taxiCar;
    }

    public double getTripBill() {
        return tripBill;
    }

    public void setTripBill(double tripBill) {
        this.tripBill = tripBill;
    }

    public int getTripDistance() {
        return tripDistance;
    }

    public void setTripDistance(int tripDistance) {
        this.tripDistance = tripDistance;
    }

    public int getTripTime() {
        return tripTime;
    }

    public void setTripTime(int tripTime) {
        this.tripTime = tripTime;
    }
}
