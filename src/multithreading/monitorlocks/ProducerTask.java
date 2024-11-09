package src.multithreading.monitorlocks;

public class ProducerTask implements Runnable{

    private SharedResource sharedResource;

    public ProducerTask(SharedResource sharedResource) {
        this.sharedResource = sharedResource;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " is executing producer task.");
        for(int i = 0; i<6; i++){
            sharedResource.addItem(i);
        }
    }
}
