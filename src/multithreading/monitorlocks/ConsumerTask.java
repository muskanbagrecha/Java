package src.multithreading.monitorlocks;

public class ConsumerTask implements Runnable {
    private SharedResource sharedResource;

    public ConsumerTask(SharedResource sharedResource) {
        this.sharedResource = sharedResource;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " running consumer task");
        for(int i = 0; i<6; i++){
            sharedResource.removeItem();
        }
    }
}
