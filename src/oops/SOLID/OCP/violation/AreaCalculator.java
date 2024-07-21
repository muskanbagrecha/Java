package src.oops.SOLID.OCP.violation;

public class AreaCalculator {

    public double calculateCircleArea(float radius){ //existing code
        return Math.PI * radius * radius;
    }

    public double calculateSquareArea(float side ){ //adding new code violates both SRP and OCP
        return side*side;
    }
}
