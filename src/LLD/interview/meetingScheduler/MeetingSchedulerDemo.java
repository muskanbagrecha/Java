package src.LLD.interview.meetingScheduler;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Arrays;

public class MeetingSchedulerDemo {
    public static void main(String[] args) {
        Room room = new Room("Tiger",1);
        Room room1 = new Room("Falooda",2);
        MeetingScheduler meetingScheduler = MeetingScheduler.getInstance();
        meetingScheduler.addRoom(room);
        meetingScheduler.addRoom(room1);
        Participant p1 = new Participant("p1", "Musk", "musk@gwsd.com");
        Participant p2 = new Participant("p2", "Cray", "SDf.com");
        Room availableRoom = meetingScheduler.findAndBookRoom(LocalDate.of(2025, 3, 3), LocalTime.of(12, 0), LocalTime.of(1, 0),2);
        meetingScheduler.bookRoom(availableRoom, LocalDate.of(2025, 3, 3), LocalTime.of(12, 0), LocalTime.of(1, 0),p1, Arrays.asList(p1, p2), 2);
        Room availableRoom1 = meetingScheduler.findAndBookRoom(LocalDate.of(2025, 3, 3), LocalTime.of(12, 0), LocalTime.of(1, 0),1);
        if(availableRoom1!=null){
            meetingScheduler.bookRoom(availableRoom1, LocalDate.of(2025, 3, 3), LocalTime.of(12, 0), LocalTime.of(1, 0),p1, Arrays.asList(p1, p2), 1);
        }
    }
}
