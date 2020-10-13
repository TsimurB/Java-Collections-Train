package train;

import train.passenger.Passenger;
import train.wagon.CommonWagon;
import train.wagon.CommunalCompartment;
import train.wagon.Compartment;
import train.wagon.Wagon;

import java.util.Arrays;

public class WagonDepot {

    public static void main(String[] args) {

        Wagon business = new Compartment(50);
        Wagon van = new CommonWagon(60);
        Wagon van2 = new CommonWagon(55);
        Wagon comfort = new CommunalCompartment(70);

        Train train = new Train(Arrays.asList(business, van, van2, comfort));

        for (Wagon wagon : train.getWagons()) {
            for (int count = 0; count < wagon.getMaxCapacity(); count++) {
                Passenger passenger = new Passenger(2);
                wagon.boardPassenger(passenger);
            }
        }

        System.out.println(train.getWagonsByRange(35, 51));
        System.out.println(train.countPassengers());
        System.out.println(train.countNumberOfBags());
    }
}
