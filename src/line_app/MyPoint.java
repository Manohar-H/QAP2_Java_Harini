package line_app;

/**
 * The MyPoint class represents a point in 2D space with x and y coordinates.
 */
public class MyPoint {
    private int x;
    private int y;

    // Default constructor (sets point to (0,0))
    public MyPoint() {
        this.x = 0;
        this.y = 0;
    }

    // Constructor with parameters
    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Getters
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    // Setters
    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    // Distance method to find the distance between this point and another point
    public double distance(MyPoint another) {
        int dx = this.x - another.x;
        int dy = this.y - another.y;
        return Math.sqrt(dx * dx + dy * dy);
    }

    // toString method
    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}