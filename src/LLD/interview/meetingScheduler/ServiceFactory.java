package src.LLD.interview.meetingScheduler;

import java.util.HashMap;

public class ServiceFactory {
    public static SchedulingService getSchedulingService() {
        return new SchedulingService(new FirstAvailableRoomAssignment());
    }

    public static MeetingService getMeetingService() {
        return new MeetingService(new HashMap<>());
    }
}
