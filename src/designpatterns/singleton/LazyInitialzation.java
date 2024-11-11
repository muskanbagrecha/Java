package src.designpatterns.singleton;

public class LazyInitialzation {

    private static LazyInitialzation lazyInitialzation;

    private LazyInitialzation() {

    }

    public static LazyInitialzation getInstance(){
        if(lazyInitialzation==null){
            lazyInitialzation = new LazyInitialzation();
        }
        return lazyInitialzation;
    }
}
