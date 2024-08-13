package src.LLD.interview.parkinglot.parkingspotassignment;

import java.util.UUID;

public interface ParkingSpotAssignmentStrategy {
    void setTotalParkingSpots(int totalParkingSpots);
    void assignParkingSpot(ParkingSpotAssignmentContext parkingSpotAssignmentContext);
    void releaseParkingSpot(UUID parkingSpotId);
}
