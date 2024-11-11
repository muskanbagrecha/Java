package src.designpatterns.singleton;

//without synchronized
//without volatile
public class BillPughSingleton {

    private static class BillPughSingletonHelper{
        private static BillPughSingleton billPughSingleton = new BillPughSingleton(); //this will be initialized only when getInstance is called as nested classes are loaded only when they are referenced/used
    }

    public BillPughSingleton getInstance(){
        return BillPughSingletonHelper.billPughSingleton;
    }
}
