package src.LLD.interview.meetingScheduler;

import java.util.List;

public class FirstAvailableRoomAssignment implements RoomAssignmentStrategy{
    public boolean findAvailability(List<MeetingInterval> schedules, MeetingInterval requiredInterval){
        int low = 0;
        int high = schedules.size()-1;
        while(low<=high){
            int mid = low + (high-low)/2;
            MeetingInterval midInterval = schedules.get(mid);
            if(isOverlapping(requiredInterval, midInterval)){
                return false;
            }
            if(requiredInterval.startTime.isBefore(midInterval.startTime)){
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return true;
    }

    private boolean isOverlapping(MeetingInterval m1, MeetingInterval m2){
        return m1.endTime.isBefore(m2.startTime) || m1.startTime.isAfter(m2.endTime);
    }
}
