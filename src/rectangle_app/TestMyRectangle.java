package rectangle_app;

import line_app.MyPoint; // Import MyPoint from Problem 1

/**
 * The TestMyRectangle class tests the functionality of MyRectangle.
 */
public class TestMyRectangle {
    public static void main(String[] args) {
        // Create rectangle using MyPoint objects
        MyPoint p1 = new MyPoint(2, 10);
        MyPoint p2 = new MyPoint(8, 4);
        MyRectangle rect1 = new MyRectangle(p1, p2);

        // Create rectangle using x and y coordinates
        MyRectangle rect2 = new MyRectangle(0, 5, 6, 0);

        // Display rectangles and their properties
        System.out.println("Rectangle 1: " + rect1);
        System.out.println("Width: " + rect1.getWidth() + ", Height: " + rect1.getHeight());
        System.out.println("Area: " + rect1.getArea() + ", Perimeter: " + rect1.getPerimeter());

        System.out.println("\nRectangle 2: " + rect2);
        System.out.println("Width: " + rect2.getWidth() + ", Height: " + rect2.getHeight());
        System.out.println("Area: " + rect2.getArea() + ", Perimeter: " + rect2.getPerimeter());
    }
}