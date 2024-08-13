package src.LLD.interview.parkinglot.parkingspot;

import java.util.UUID;

public abstract class ParkingSpot {
    private final UUID id;
    private final String type;
    private boolean isAvailable;
    public ParkingSpot(String type){
        this.id = UUID.randomUUID();
        this.type = type;
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
}
