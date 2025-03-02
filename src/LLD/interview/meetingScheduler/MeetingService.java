package src.LLD.interview.meetingScheduler;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;

public class MeetingService {
    public HashMap<Room, List<Meeting>> meetings;

    public MeetingService(HashMap<Room, List<Meeting>> meetings) {
        this.meetings = new HashMap<>();
    }

    public Meeting createMeeting(Room room, Participant host, List<Participant> participants, LocalDate date, MeetingInterval meetingInterval) {
        Meeting meeting = new Meeting(room, host, participants, date,meetingInterval);
        meetings.get(room).add(meeting);
        return meeting;
    }

    public HashMap<Room, List<Meeting>> getMeetings() {
        return meetings;
    }

    public void setMeetings(HashMap<Room, List<Meeting>> meetings) {
        this.meetings = meetings;
    }
}
