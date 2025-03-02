package src.LLD.interview.meetingScheduler;

import java.util.List;

public interface RoomAssignmentStrategy {
     boolean findAvailability(List<MeetingInterval> schedules, MeetingInterval requiredInterval);

     }
