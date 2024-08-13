package src.LLD.interview.parkinglot.parkingspotassignment;

import src.LLD.interview.parkinglot.terminal.EntryTerminal;

public class ParkingSpotAssignmentContext {
    private EntryTerminal entryTerminal = null;

    public ParkingSpotAssignmentContext(){

    }

    public ParkingSpotAssignmentContext(EntryTerminal entryTerminal){
        this.entryTerminal = entryTerminal;
    }

    public EntryTerminal getEntryTerminal() {
        return entryTerminal;
    }
}
