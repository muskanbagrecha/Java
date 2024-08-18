package src.LLD.interview.parkinglot.parkingspotassignment;

import src.LLD.interview.parkinglot.parkingspot.ParkingSpot;

import java.util.Comparator;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.UUID;

public class NearestParkingSpotAssignmentStrategy implements ParkingSpotAssignmentStrategy {

    HashSet<ParkingSpot> availableParkingSpots;
    HashSet<ParkingSpot> allParkingSpots;

    public NearestParkingSpotAssignmentStrategy(){
        availableParkingSpots = new HashSet<>(allParkingSpots);
    }

    @Override
    public ParkingSpot assignParkingSpot(ParkingSpotAssignmentContext parkingSpotAssignmentContext) {
        if(parkingSpotAssignmentContext.getEntryTerminalID()==-1){
            System.out.println("Pass entry terminal ID!!");
        }
        PriorityQueue<ParkingSpot> filteredSpots = new PriorityQueue<>(Comparator.comparingInt(o -> o.getDistanceToEntryTerminal(parkingSpotAssignmentContext.getEntryTerminalID())));
        if(!filteredSpots.isEmpty()){
            ParkingSpot parkingSpot = filteredSpots.poll();
            parkingSpot.setAvailable(false);
            availableParkingSpots.remove(parkingSpot);
            return parkingSpot;
        }
        return null;
    }

    @Override
    public void releaseParkingSpot(UUID parkingSpotId) {
        ParkingSpot parkingSpot = allParkingSpots.stream().filter(parkingSpot1 -> parkingSpot1.getId().equals(parkingSpotId)).findFirst().get();
        parkingSpot.setAvailable(true);
        availableParkingSpots.add(allParkingSpots.stream().filter(spot -> spot.getId().equals(parkingSpotId)).findFirst().get());
    }
}