package src.multithreading.problems.foobar;

public class FooBarPrinter {
    private final int n;
    private boolean fooTurn = true; // To control alternation

    public FooBarPrinter(int n) {
        this.n = n;
    }

    public synchronized void printFoo() throws InterruptedException {
        for (int i = 0; i < n; i++) {
            while (!fooTurn) { // Wait if it’s not Foo's turn
                wait();
            }
            System.out.println("Foo");
            fooTurn = false; // Set flag for Bar's turn
            notify(); // Wake up Bar thread
        }
    }

    public synchronized void printBar() throws InterruptedException {
        for (int i = 0; i < n; i++) {
            while (fooTurn) { // Wait if it’s not Bar's turn
                wait();
            }
            System.out.println("Bar");
            fooTurn = true; // Set flag for Foo's turn
            notify(); // Wake up Foo thread
        }
    }

    public static void main(String[] args) {
        FooBarPrinter fooBarPrinter = new FooBarPrinter(5);

        Thread fooThread = new Thread(() -> {
            try {
                fooBarPrinter.printFoo();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        Thread barThread = new Thread(() -> {
            try {
                fooBarPrinter.printBar();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        fooThread.start();
        barThread.start();
    }
}