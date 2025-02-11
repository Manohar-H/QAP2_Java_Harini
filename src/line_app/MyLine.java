package line_app;

/**
 * The MyLine class represents a line defined by two MyPoint objects.
 */
public class MyLine {
    private MyPoint begin;
    private MyPoint end;

    // Constructor using MyPoint objects
    public MyLine(MyPoint begin, MyPoint end) {
        this.begin = begin;
        this.end = end;
    }

    // Constructor using x and y coordinates
    public MyLine(int x1, int y1, int x2, int y2) {
        this.begin = new MyPoint(x1, y1);
        this.end = new MyPoint(x2, y2);
    }

    // Getters
    public MyPoint getBegin() {
        return begin;
    }

    public MyPoint getEnd() {
        return end;
    }

    // Setters
    public void setBegin(MyPoint begin) {
        this.begin = begin;
    }

    public void setEnd(MyPoint end) {
        this.end = end;
    }

    // Getters for individual x and y values
    public int getBeginX() {
        return begin.getX();
    }

    public int getBeginY() {
        return begin.getY();
    }

    public int getEndX() {
        return end.getX();
    }

    public int getEndY() {
        return end.getY();
    }

    // Length of the line (distance between begin and end points)
    public double getLength() {
        return begin.distance(end);
    }

    // toString method
    @Override
    public String toString() {
        return "Line[Begin=" + begin + ", End=" + end + "]";
    }
}
