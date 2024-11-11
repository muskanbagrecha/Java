package src.designpatterns.singleton;

public class EagerInitialization {
    private static EagerInitialization eagerInitialization = new EagerInitialization();
    private EagerInitialization(){

    }

    public static EagerInitialization getInstance(){
        return eagerInitialization;
    }
}
