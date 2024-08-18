package src.LLD.interview.parkinglot.parkinglot;

import src.LLD.interview.parkinglot.parkingspot.ParkingSpot;
import src.LLD.interview.parkinglot.parkingspotassignment.ParkingSpotAssignmentContext;
import src.LLD.interview.parkinglot.parkingspotassignment.ParkingSpotAssignmentStrategy;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class ParkingLot {
    private static final ParkingLot parkingLot = new ParkingLot();
    private ParkingSpotAssignmentStrategy parkingSpotAssignmentStrategy;
    private int totalEntryTerminals;
    private int totalExitTerminals;
    private Map<UUID, ParkingSpot> parkingSpots;

    private ParkingLot(){
    }

    public static ParkingLot getParkingLot(){
        return parkingLot;
    }

    public static synchronized void init(int totalParkingSpots, ParkingSpotAssignmentStrategy parkingSpotAssignmentStrategy, int totalEntryTerminals, int totalExitTerminals){
        // Initialize the parking lot with total parking spots and parking spot assignment strategy
        parkingLot.parkingSpotAssignmentStrategy = parkingSpotAssignmentStrategy;
        parkingLot.totalEntryTerminals = totalEntryTerminals;
        parkingLot.totalExitTerminals = totalExitTerminals;
        parkingLot.parkingSpots = new HashMap<>(totalParkingSpots);
    }

    public ParkingSpot assignSpot(ParkingSpotAssignmentContext parkingSpotAssignmentContext){
        return parkingLot.parkingSpotAssignmentStrategy.assignParkingSpot(parkingSpotAssignmentContext);
    }
}
