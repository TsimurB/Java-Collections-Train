package train.wagon;

import train.ComfortLevel;
import train.passenger.Passenger;

public class Compartment extends Wagon {

    public Compartment(int maxCapacity) {
        super(maxCapacity);
        setComfortLevel(ComfortLevel.BUSINESS);
    }

    @Override
    public void boardPassenger(Passenger passenger) {
        System.out.println("заходите, будьте любезны");
        getPassengers().add(passenger);
    }
}
