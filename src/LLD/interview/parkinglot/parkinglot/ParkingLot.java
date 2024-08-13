package src.LLD.interview.parkinglot.parkinglot;

import src.LLD.interview.parkinglot.parkingspotassignment.ParkingSpotAssignmentContext;
import src.LLD.interview.parkinglot.parkingspotassignment.ParkingSpotAssignmentStrategy;

public class ParkingLot {
    private static final ParkingLot parkingLot = new ParkingLot();
    private ParkingSpotAssignmentStrategy parkingSpotAssignmentStrategy;
    private int totalEntryTerminals;
    private int totalExitTerminals;

    private ParkingLot(){

    }

    public static ParkingLot getParkingLot(){
        return parkingLot;
    }

    public static synchronized void init(int totalParkingSpots, ParkingSpotAssignmentStrategy parkingSpotAssignmentStrategy, int totalEntryTerminals, int totalExitTerminals){
        // Initialize the parking lot with total parking spots and parking spot assignment strategy
        parkingLot.parkingSpotAssignmentStrategy = parkingSpotAssignmentStrategy;
        parkingLot.parkingSpotAssignmentStrategy.setTotalParkingSpots(totalParkingSpots);
        parkingLot.totalEntryTerminals = totalEntryTerminals;
        parkingLot.totalExitTerminals = totalExitTerminals;
    }

    public boolean assignSpot(){
        //TODO
    }
}
