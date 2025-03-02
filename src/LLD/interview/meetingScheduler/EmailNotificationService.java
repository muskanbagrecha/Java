package src.LLD.interview.meetingScheduler;

public class EmailNotificationService implements MeetingObserver{
    @Override
    public void notify(Meeting meeting) {
        for(Participant participant : meeting.getParticipants()){
            System.out.println("Mail sent to : " + participant.email);
        }
    }
}
