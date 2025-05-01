import java.awt.*;
import java.util.ArrayList;

public class BigRectLister {
    public static void main(String[] args) {
        Filter f = new BigRectangleFilter();
        ArrayList<Rectangle> rectangles = new ArrayList<>();

        // Add 10 rectangles with varied sizes
        rectangles.add(new Rectangle(1, 1, 1, 1));
        rectangles.add(new Rectangle(0, 0, 3, 2));
        rectangles.add(new Rectangle(0, 0, 2, 4));
        rectangles.add(new Rectangle(0, 0, 5, 1));
        rectangles.add(new Rectangle(0, 0, 1, 6));
        rectangles.add(new Rectangle(0, 0, 2, 2));
        rectangles.add(new Rectangle(0, 0, 4, 4));
        rectangles.add(new Rectangle(0, 0, 3, 3));
        rectangles.add(new Rectangle(0, 0, 6, 2));
        rectangles.add(new Rectangle(0, 0, 5, 5));

        System.out.println("Rectangles with perimeter > 10:");
        for (Rectangle r : rectangles) {
            if (f.accept(r)) {
                System.out.println("Rectangle at (" + r.x + "," + r.y + ") width=" + r.width + " height=" + r.height);
            }
        }
    }
}
