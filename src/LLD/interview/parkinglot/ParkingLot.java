package src.LLD.interview.parkinglot;

public class ParkingLot {
    private static final ParkingLot parkingLot = new ParkingLot();

    private ParkingLot(){

    }

    public static ParkingLot getParkingLot(){
        return parkingLot;
    }
}
