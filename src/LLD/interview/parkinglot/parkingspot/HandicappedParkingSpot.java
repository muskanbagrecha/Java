package src.LLD.interview.parkinglot.parkingspot;

import java.util.Map;

public class HandicappedParkingSpot extends ParkingSpot {

    public HandicappedParkingSpot(String type, Map<Integer, Integer> distanceToEntryTerminal) {
        super("HANDICAPPED", distanceToEntryTerminal);
    }
}
