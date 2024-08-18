package src.LLD.interview.parkinglot.parkingspotassignment;

import src.LLD.interview.parkinglot.terminal.EntryTerminal;

public class ParkingSpotAssignmentContext {
    private int entryTerminalID;

    public ParkingSpotAssignmentContext(){
        entryTerminalID = -1;
    }

    public ParkingSpotAssignmentContext(int entryTerminalID){
        this.entryTerminalID = entryTerminalID;
    }

    public int getEntryTerminalID() {
        return entryTerminalID;
    }
}
