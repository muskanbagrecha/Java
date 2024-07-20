package src;

public class TestEnum {

    public Status status;

    public TestEnum(Status status){
        this.status = status;
    }

    public enum Status{
        ORDERED, READY, DELIVERED;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
