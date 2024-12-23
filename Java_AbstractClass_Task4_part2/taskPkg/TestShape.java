package taskPkg;

import java.util.List;

public class TestShape {
    public static void drawShapes(List<? extends Shape> shapes) {
        for (Shape shape : shapes) {
            shape.draw();
        }
    }
}
