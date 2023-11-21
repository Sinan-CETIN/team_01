package objects;

public class Besgen {
    private Point[] points;

    public Besgen() {
        points = new Point[5];
    }

    public Point[] getPoints() {
        return this.points;
    }

    public Besgen(Point[] points) {
        this.points = points;
    }

    public Besgen(Point p1, Point p2, Point p3, Point p4, Point p5) {
        this(createArray(p1, p2, p3, p4, p5));
        System.out.println("Pointlerin ayri ayri verildigi constructor!");
        // once array olustur sonra this(argumentli) kullanamazsiniz

    }

    private static Point[] createArray(Point p1, Point p2, Point p3, Point p4, Point p5) {
        Point[] array = new Point[5];
        array[0] = p1;
        array[1] = p2;
        array[2] = p3;
        array[3] = p4;
        array[4] = p5;
        return array;
    }

    double side1() {
        return points[0].distance(points[1]);
    }

    double side2() {
        return points[1].distance(points[2]);
    }

    double side3() {
        return points[2].distance(points[3]);
    }

    double side4() {
        return points[3].distance(points[4]);
    }

    double side5() {
        return points[0].distance(points[4]);
    }

    public double getPerimeter() {
        return this.side1() + this.side2() + this.side3() + this.side4() + this.side5();
    }
}
