package src.LLD.interview.vendingmachine.currency;

public enum Note {
    TEN(10),
    TWENTY(20),
    FIFTY(50),
    HUNDRED(100),
    FIVEHUNDRED(500);
    private int value;

    Note(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
