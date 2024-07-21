package src.oops.SOLID.OCP.expectation;

public class Circle implements Shape{

    private float radius;

    public Circle(float radius){
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * this.radius * this.radius;
    }
}
