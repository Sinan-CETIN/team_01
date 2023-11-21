package objects;

public class Example {
    public static void main(String[] args) {
        Point point1 = new Point();
        Point point2 = new Point(0, 3);
        Point point3 = new Point(4, 0);
        Triangle triangle = new Triangle(point1, point2, point3);

    }
}
