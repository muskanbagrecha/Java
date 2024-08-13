package src.LLD.interview.parkinglot.parkinglot;

import src.LLD.interview.parkinglot.parkingspotassignment.ParkingSpotAssignmentStrategy;

public class ParkingLotBuilder {
    private int totalParkingSpots;
    private int totalEntryTerminals = 1;
    private int totalExitTerminals = 1;
    private ParkingSpotAssignmentStrategy parkingSpotAssignmentStrategy;

    public ParkingLotBuilder setParkingSpots(int totalParkingSpots){
        this.totalParkingSpots = totalParkingSpots;
        return this;
    }

    public ParkingLotBuilder setParkingSpotAssignmentStrategy(ParkingSpotAssignmentStrategy parkingSpotAssignmentStrategy){
        this.parkingSpotAssignmentStrategy = parkingSpotAssignmentStrategy;
        return this;
    }

    public ParkingLotBuilder setEntryTerminals(int totalEntryTerminals){
        this.totalEntryTerminals = totalEntryTerminals;
        return this;
    }

    public ParkingLotBuilder setExitTerminals(int totalExitTerminals){
        this.totalExitTerminals = totalExitTerminals;
        return this;
    }

    public ParkingLot build(){
        ParkingLot.init(totalParkingSpots, parkingSpotAssignmentStrategy, totalEntryTerminals, totalExitTerminals);
        return ParkingLot.getParkingLot();
    }

}
