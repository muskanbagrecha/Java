package src.LLD.interview.parkinglot.model;

import src.LLD.interview.parkinglot.parkingspot.ParkingSpot;

import java.util.Date;
import java.util.UUID;

public class  ParkingTicket {
    private UUID parkingSpotId;
    private String parkingSpotType;
    private Date startTime;

    public ParkingTicket(UUID parkingSpotId, String parkingSpotType){
        this.parkingSpotId = parkingSpotId;
        this.parkingSpotType = parkingSpotType;
        this.startTime = new Date();
    }
}
