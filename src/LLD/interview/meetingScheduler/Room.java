package src.LLD.interview.meetingScheduler;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Objects;
import java.util.TreeSet;

public class Room {
    HashMap<LocalDate, TreeSet<MeetingInterval>> roomSchedules;
    String name;
    int capacity;
    public Room(String name, int capacity) {
        this.name = name;
        this.roomSchedules = new HashMap<>();
        this.capacity = capacity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public HashMap<LocalDate, TreeSet<MeetingInterval>> getRoomSchedules() {
        return roomSchedules;
    }

    public void setRoomSchedules(HashMap<LocalDate, TreeSet<MeetingInterval>> roomSchedules) {
        this.roomSchedules = roomSchedules;
    }

    public void addbooking(LocalDate date, MeetingInterval meetingInterval){
        roomSchedules.putIfAbsent(date, new TreeSet<>());
        roomSchedules.get(date).add(meetingInterval);
    }

    @Override
    public String toString() {
        return "Room{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Room room = (Room) o;
        return Objects.equals(name, room.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
