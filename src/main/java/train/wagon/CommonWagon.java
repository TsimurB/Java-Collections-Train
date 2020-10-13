package train.wagon;

import train.ComfortLevel;
import train.passenger.Passenger;

public class CommonWagon extends Wagon {
    public CommonWagon(int maxCapacity) {
        super(maxCapacity);
        setComfortLevel(ComfortLevel.ECONOMY);
    }

    @Override
    public void boardPassenger(Passenger passenger) {
        System.out.println("заходи, пёс!");
        getPassengers().add(passenger);
    }

}
