package line_app;

/**
 * The TestMyLine class tests the functionality of MyPoint and MyLine classes.
 */
public class TestMyLine {
    public static void main(String[] args) {
        // Create points
        MyPoint p1 = new MyPoint(3, 4);
        MyPoint p2 = new MyPoint(6, 8);

        // Display points
        System.out.println("Point 1: " + p1);
        System.out.println("Point 2: " + p2);
        System.out.println("Distance between points: " + p1.distance(p2));

        // Create lines using different constructors
        MyLine line1 = new MyLine(p1, p2);
        MyLine line2 = new MyLine(0, 0, 5, 5);

        // Display lines
        System.out.println("\nLine 1: " + line1);
        System.out.println("Length of Line 1: " + line1.getLength());

        System.out.println("\nLine 2: " + line2);
        System.out.println("Length of Line 2: " + line2.getLength());
    }
}