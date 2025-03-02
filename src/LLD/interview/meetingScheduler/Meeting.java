package src.LLD.interview.meetingScheduler;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

public class Meeting {
    UUID meetingid;
    Room room;
    Participant host;
    List<Participant> participants;
    LocalDate date;
    MeetingInterval meetingInterval;
    MeetingStatus meetingStatus;

    public Meeting(Room room, Participant host, List<Participant> participants, LocalDate date, MeetingInterval meetingInterval) {
        this.meetingid = UUID.randomUUID();
        this.room = room;
        this.host = host;
        this.participants = participants;
        this.date = date;
        this.meetingInterval = meetingInterval;
        this.meetingStatus = MeetingStatus.CREATED;
    }

    public UUID getMeetingid() {
        return meetingid;
    }

    public void setMeetingid(UUID meetingid) {
        this.meetingid = meetingid;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public Participant getHost() {
        return host;
    }

    public void setHost(Participant host) {
        this.host = host;
    }

    public List<Participant> getParticipants() {
        return participants;
    }

    public void setParticipants(List<Participant> participants) {
        this.participants = participants;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public MeetingInterval getMeetingInterval() {
        return meetingInterval;
    }

    public void setMeetingInterval(MeetingInterval meetingInterval) {
        this.meetingInterval = meetingInterval;
    }

    @Override
    public String toString() {
        return "Meeting{" +
                "meetingid=" + meetingid +
                ", room=" + room +
                ", host=" + host +
                ", participants=" + participants +
                ", date=" + date +
                ", meetingInterval=" + meetingInterval +
                ", meetingStatus=" + meetingStatus +
                '}';
    }
}
