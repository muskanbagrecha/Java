package src.LLD.interview.meetingScheduler;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class MeetingScheduler {
    private static MeetingScheduler meetingScheduler;
    private SchedulingService schedulingService;
    private MeetingService meetingService;
    private NotificationService notificationService;

    private MeetingScheduler() {
        this.schedulingService = ServiceFactory.getSchedulingService();
        this.meetingService = ServiceFactory.getMeetingService();
        this.notificationService = new NotificationService(); // Uses Observer Pattern

        // Register notification observers
        notificationService.addObserver(new EmailNotificationService());
    }

    public synchronized static MeetingScheduler getInstance() {
        if (meetingScheduler == null) {
            synchronized (MeetingScheduler.class) {
                if (meetingScheduler == null) {
                    meetingScheduler = new MeetingScheduler();
                }
            }
        }
        return meetingScheduler;
    }

    public  void addRoom(Room room){
        schedulingService.roomsinventory.add(room);
        meetingService.getMeetings().put(room, new ArrayList<>());
    }

    Room findAndBookRoom(LocalDate date, LocalTime startTime, LocalTime endTime, int capacity){
        MeetingInterval meetingInterval = new MeetingInterval(startTime, endTime);
        Optional<Room> room = schedulingService.findRooms(date, meetingInterval, capacity);
        if(room.isEmpty()){
            System.out.println("No rooms available");
        }
        return room.get();
    }
    public Meeting bookRoom(Room room, LocalDate date, LocalTime startTime, LocalTime endTime, Participant host, List<Participant> participants, int cap) {
        MeetingInterval meetingInterval = new MeetingInterval(startTime, endTime);
        boolean isSuccessful = schedulingService.bookRoom(room, date, meetingInterval, cap);

        if (isSuccessful) {
            Meeting meeting = meetingService.createMeeting(room, host, participants, date, meetingInterval);
            System.out.println("📅 Meeting booked: " + meeting);

            // Notify all registered observers
            notificationService.notify(meeting);

            return meeting;
        }

        System.out.println("⚠️ Some error occurred while booking.");
        return null;
    }


}