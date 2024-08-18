package src.LLD.interview.parkinglot;

import src.LLD.interview.parkinglot.parkinglot.ParkingLot;
import src.LLD.interview.parkinglot.parkinglot.ParkingLotBuilder;
import src.LLD.interview.parkinglot.parkingspotassignment.NearestParkingSpotAssignmentStrategy;
import src.LLD.interview.parkinglot.parkingspotassignment.ParkingSpotAssignmentContext;
import src.LLD.interview.parkinglot.terminal.EntryTerminal;

public class ParkingLotDriver {
    public static void main(String[] args){
        ParkingLotBuilder parkingLotBuilder = new ParkingLotBuilder();
        ParkingLot parkingLot = parkingLotBuilder
                .setParkingSpots(10)
                .setParkingSpotAssignmentStrategy(new NearestParkingSpotAssignmentStrategy())
                .setEntryTerminals(2)
                .setExitTerminals(2)
                .build();

        // Parking lot is initialized with 10 parking spots and nearest parking spot assignment strategy
//        parkingLot.assignSpot(new ParkingSpotAssignmentContext(new EntryTerminal("1"))); // Entry terminal 1
        // Entry terminal 1



    }
}
