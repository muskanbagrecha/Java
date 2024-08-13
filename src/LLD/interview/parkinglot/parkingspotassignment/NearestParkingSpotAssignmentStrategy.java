package src.LLD.interview.parkinglot.parkingspotassignment;

import java.util.UUID;

public class NearestParkingSpotAssignmentStrategy implements ParkingSpotAssignmentStrategy {

    @Override
    public void assignParkingSpot(ParkingSpotAssignmentContext parkingSpotAssignmentContext) {
        if(parkingSpotAssignmentContext.getEntryTerminal()==null){
            System.out.println("Pass entry terminal ID!!");
            return;
        }
    }

    @Override
    public void releaseParkingSpot(UUID parkingSpotId) {

    }
}
