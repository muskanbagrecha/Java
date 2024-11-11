package src.designpatterns.singleton;

public class SynchronizedLazyInitialization {
    private static SynchronizedLazyInitialization synchronizedLazyInitialization;

    private SynchronizedLazyInitialization() {

    }

    public static synchronized SynchronizedLazyInitialization getInstance(){
        if(synchronizedLazyInitialization==null){
            synchronizedLazyInitialization = new SynchronizedLazyInitialization();
        }
        return synchronizedLazyInitialization;
    }
}
