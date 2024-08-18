package src.LLD.interview.parkinglot.parkingspot;

import java.util.Map;

public class LargeParkingSpot extends ParkingSpot {

    public LargeParkingSpot(String type, Map<Integer, Integer> distanceToEntryTerminal) {
        super("LARGE", distanceToEntryTerminal);
    }

}
