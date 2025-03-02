package src.LLD.interview.meetingScheduler;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.TreeSet;

public class SchedulingService {
    public List<Room> roomsinventory;
    private RoomAssignmentStrategy roomAssignmentStrategy;

    public SchedulingService(RoomAssignmentStrategy roomAssignmentStrategy) {
        this.roomsinventory = new ArrayList<>();
        this.roomAssignmentStrategy = roomAssignmentStrategy;
    }

    public Optional<Room> findRooms(LocalDate date, MeetingInterval meetingInterval, int capacity) {
        for(Room room : roomsinventory){
            if(room.capacity<capacity){
                continue;
            }
            room.roomSchedules.putIfAbsent(date, new TreeSet<>());
            boolean available = roomAssignmentStrategy.findAvailability(new ArrayList<>(room.roomSchedules.get(date)), meetingInterval);
            if(available){
                return Optional.of(room);
            }
        }
        return Optional.empty();
    }

    public boolean bookRoom(Room room, LocalDate date, MeetingInterval meetingInterval, int cap) {
        if(room.capacity<cap || !roomAssignmentStrategy.findAvailability(new ArrayList<>(room.roomSchedules.get(date)), meetingInterval)){
            return false;
        }
        room.addbooking(date, meetingInterval);
        return true;
    }
}
