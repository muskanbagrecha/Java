package src.LLD.interview.parkinglot.parkingspotassignment;

import src.LLD.interview.parkinglot.parkingspot.ParkingSpot;

import java.util.UUID;

public interface ParkingSpotAssignmentStrategy {
    ParkingSpot assignParkingSpot(ParkingSpotAssignmentContext parkingSpotAssignmentContext);
    void releaseParkingSpot(UUID parkingSpotId);
}
