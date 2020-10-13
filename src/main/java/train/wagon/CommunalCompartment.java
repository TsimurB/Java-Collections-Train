package train.wagon;

import train.ComfortLevel;
import train.passenger.Passenger;

public class CommunalCompartment extends Wagon {
    public CommunalCompartment(int maxCapacity) {
        super(maxCapacity);
        setComfortLevel(ComfortLevel.COMFORT);
    }

    @Override
    public void boardPassenger(Passenger passenger) {
        System.out.println("проходите!");
        getPassengers().add(passenger);
    }
}
