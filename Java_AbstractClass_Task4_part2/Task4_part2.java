import taskPkg.*;

import java.util.ArrayList;
import java.util.List;

public class Task4_part2 {
    public static void main(String[] args) {
        //ArrayList of Rectangles
        List<Rectangle> rectangles = new ArrayList<Rectangle>();
        rectangles.add(new Rectangle());
        rectangles.add(new Rectangle());


        //ArrayList of Shapes
        List<Shape> shapes = new ArrayList<Shape>();
        shapes.add(new Rectangle());
        shapes.add(new Circle());


        //testing the generic method
        System.out.println("Drawing Rectangles:");
        TestShape.drawShapes(rectangles);

        System.out.println("\nDrawing Shapes:");
        TestShape.drawShapes(shapes);
    }
}
