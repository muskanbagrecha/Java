package src.LLD.interview.meetingScheduler;

import java.time.LocalTime;

public class MeetingInterval implements Comparable<MeetingInterval> {
    LocalTime startTime;
    LocalTime endTime;

    public LocalTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalTime startTime) {
        this.startTime = startTime;
    }

    public LocalTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalTime endTime) {
        this.endTime = endTime;
    }

    public MeetingInterval(LocalTime startTime, LocalTime endTime) {
        this.startTime = startTime;
        this.endTime = endTime;
    }

    @Override
    public int compareTo(MeetingInterval o) {

            if(!this.startTime.equals(o.startTime)){
                return this.startTime.compareTo(o.startTime);
            }
            return this.endTime.compareTo(o.endTime);
        }

    @Override
    public String toString() {
        return "MeetingInterval{" +
                "startTime=" + startTime +
                ", endTime=" + endTime +
                '}';
    }
}
