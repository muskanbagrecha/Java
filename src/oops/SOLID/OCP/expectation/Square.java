package src.oops.SOLID.OCP.expectation;

public class Square implements Shape{
    private float side;

    public Square(float side) {
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return this.side * this.side;
    }
}

//Let's say this is a new feature. We were easily able to add this code without modifying any existing code -OCP
//Also, this adheres well to SRP as this class only concerned with calculating area for square.