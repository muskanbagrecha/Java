package src.LLD.interview.parkinglot.model;

import src.LLD.interview.parkinglot.parkingspot.ParkingSpot;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.UUID;

public class  ParkingTicket {
    private UUID parkingSpotId;
    private String parkingSpotType;
    private LocalDateTime startTime;
    private LocalDateTime endTime;

    public ParkingTicket(UUID parkingSpotId, String parkingSpotType){
        this.parkingSpotId = parkingSpotId;
        this.parkingSpotType = parkingSpotType;
        this.startTime = LocalDateTime.now();
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
    }
}
