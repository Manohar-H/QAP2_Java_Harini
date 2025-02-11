package rectangle_app;

import line_app.MyPoint; // Import MyPoint from Problem 1

/**
 * The MyRectangle class represents a rectangle using two MyPoint objects.
 */
public class MyRectangle {
    private MyPoint topLeft;
    private MyPoint bottomRight;

    // Constructor using MyPoint objects
    public MyRectangle(MyPoint topLeft, MyPoint bottomRight) {
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
    }

    // Constructor using x and y coordinates
    public MyRectangle(int x1, int y1, int x2, int y2) {
        this.topLeft = new MyPoint(x1, y1);
        this.bottomRight = new MyPoint(x2, y2);
    }

    // Getters
    public MyPoint getTopLeft() {
        return topLeft;
    }

    public MyPoint getBottomRight() {
        return bottomRight;
    }

    // Setters
    public void setTopLeft(MyPoint topLeft) {
        this.topLeft = topLeft;
    }

    public void setBottomRight(MyPoint bottomRight) {
        this.bottomRight = bottomRight;
    }

    // Get width (distance between x-coordinates)
    public int getWidth() {
        return Math.abs(bottomRight.getX() - topLeft.getX());
    }

    // Get height (distance between y-coordinates)
    public int getHeight() {
        return Math.abs(bottomRight.getY() - topLeft.getY());
    }

    // Calculate area
    public int getArea() {
        return getWidth() * getHeight();
    }

    // Calculate perimeter
    public int getPerimeter() {
        return 2 * (getWidth() + getHeight());
    }

    // toString method
    @Override
    public String toString() {
        return "Rectangle[TopLeft=" + topLeft + ", BottomRight=" + bottomRight +
               ", Width=" + getWidth() + ", Height=" + getHeight() + "]";
    }
}
