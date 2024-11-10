package src.multithreading.problems.oddeven;

public class OddEven {
    /*
    Problem Statement

    Use two threads to print numbers from 1 to n (say, up to 10).
    One thread should print only even numbers and the other only odd numbers.
    The output should alternate correctly, like: 1 2 3 4 5 6 7 8 9 10.
    */

    public static void main(String[] args){
        SharedResource sharedResource = new SharedResource(10);
        Thread thread1 = new Thread(sharedResource::printEven);
        Thread thread2 = new Thread(sharedResource::printOdd);
        thread1.start();
        thread2.start();
    }
}


//create two threads
//have a counter (shared)
//thread1 starts printing and after one printing it has to "give control to next thread"
//ennd when n is 10