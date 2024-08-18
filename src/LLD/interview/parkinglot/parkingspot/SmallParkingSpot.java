package src.LLD.interview.parkinglot.parkingspot;

import java.util.Map;

public class SmallParkingSpot extends ParkingSpot {
    public SmallParkingSpot(String type, Map<Integer, Integer> distanceToEntryTerminal) {
        super("SMALL", distanceToEntryTerminal);
    }
}
