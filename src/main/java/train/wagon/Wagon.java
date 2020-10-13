package train.wagon;

import train.ComfortLevel;
import train.passenger.Passenger;

import java.util.ArrayList;
import java.util.List;

public abstract class Wagon {

    private List<Passenger> passengers = new ArrayList<>();
    private int maxCapacity;
    private ComfortLevel comfortLevel;

    public Wagon(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    public abstract void boardPassenger(Passenger passenger);

    public List<Passenger> getPassengers() {
        return passengers;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public ComfortLevel getComfortLevel() {
        return comfortLevel;
    }

    public void setComfortLevel(ComfortLevel comfortLevel) {
        this.comfortLevel = comfortLevel;
    }
}
