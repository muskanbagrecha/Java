package src.LLD.interview.parkinglot.terminal;

import src.LLD.interview.parkinglot.model.ParkingTicket;

import java.util.UUID;

public class EntryTerminal extends Terminal{

    public ParkingTicket createTicket(UUID parkingSpotId, String parkingSpotType){
        ParkingTicket ticket = new ParkingTicket(parkingSpotId, parkingSpotType);
        printTicket(ticket);
        return ticket;
    }

    public void printTicket(ParkingTicket ticket){
        //print process;
    }

}
