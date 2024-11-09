package src.multithreading.monitorlocks;

import java.util.LinkedList;
import java.util.Queue;

public class SharedResource {
    private Queue<Integer> queueBuffer = new LinkedList<>();
    private int capacity;

    public SharedResource(int capacity) {
        this.queueBuffer = new LinkedList<>();
        this.capacity = capacity;
    }

    public synchronized void addItem(int item) {
        while (queueBuffer.size()>=capacity){
            try{
                wait();
            }
            catch (Exception ex){

            }
        }
        queueBuffer.add(item);
        System.out.println("Added item" + Thread.currentThread().getName());
        notifyAll();
    }

    public synchronized int removeItem(){
        while (queueBuffer.isEmpty()){
            try{
                wait();
            }
            catch (Exception ignored){

            }
        }
        int item = queueBuffer.remove();
        System.out.println("Removed item by" + Thread.currentThread().getName());
        notifyAll();
        return item;
    }
}
