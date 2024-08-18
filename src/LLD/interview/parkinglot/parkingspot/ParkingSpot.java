package src.LLD.interview.parkinglot.parkingspot;

import java.util.Map;
import java.util.UUID;

public abstract class ParkingSpot {
    private final UUID id;
    private final String type;
    private boolean isAvailable;
    Map<Integer, Integer> distanceToEntryTerminal;

    public ParkingSpot(String type, Map<Integer, Integer> distanceToEntryTerminal) {
        this.id = UUID.randomUUID();
        this.type = type;
        this.isAvailable = true;
        this.distanceToEntryTerminal = distanceToEntryTerminal;
    }
    public String getType(){
        return type;
    }

    public UUID getId(){
        return id;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public int getDistanceToEntryTerminal(int id) {
        return distanceToEntryTerminal.get(id);
    }
}
