package src.multithreading.problems.oddeven;

public class SharedResource {
    int ctr = 1;
    int max;

    public SharedResource(int max){
        this.max = max;
    }

    public synchronized void printEven(){
        while(ctr<=max){
            if(ctr%2!=0){
                try{
                    wait(); //wait for odd to be printed
                }
                catch (Exception ex){

                }
            }
            if(ctr<=max){
                System.out.println("Current thread: " + Thread.currentThread().getName() + " :: ctr :: " + ctr);
                ctr++;
                notify();
            }
        }
    }

    public synchronized void printOdd(){
        while(ctr<=max){
            if(ctr%2==0){
                try{
                    wait(); //wait for odd to be printed
                }
                catch (Exception ex){

                }
            }
            if(ctr<=max){
                System.out.println("Current thread: " + Thread.currentThread().getName() + " :: ctr :: " + ctr);
                ctr++;
                notify();
            }
        }
    }
}
