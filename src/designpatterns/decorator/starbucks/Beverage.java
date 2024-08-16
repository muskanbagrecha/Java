package src.designpatterns.decorator.starbucks;

public abstract class Beverage {

    public enum Size{
        TALL,
        GRANDE,
        VENTI
    }

    protected String description = "unknown description";

    protected Size size = Size.GRANDE; // Default size

    public String getDescription(){
        return this.description;
    }

    public abstract double cost();

    public Size getSize(){
        return size;
    }

    public void setSize(Size size){
        this.size = size;
    }
}
