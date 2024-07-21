package src.oops.SOLID.OCP.expectation;

import java.util.List;

public class TotalArea {

    public static double calculateTotalArea(List<Shape> shapes){
        double area = 0;
        for(Shape shape : shapes){
            area+=shape.calculateArea();
        }
        return area;
    }

}
