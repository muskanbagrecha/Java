package src.LLD.interview.meetingScheduler;

import java.util.ArrayList;
import java.util.List;

public class NotificationService {
    List<MeetingObserver> observers;

    public NotificationService() {
        this.observers = new ArrayList<>();
    }

    public void addObserver(MeetingObserver observer){
        observers.add(observer);
    }

    public void notify(Meeting meeting){
        for(MeetingObserver observer : observers){
            observer.notify(meeting);
        }
    }
}
