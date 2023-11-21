package points;

public class Triangle {
    private Point[] points = new Point[3];

    Triangle(Point point1, Point point2, Point point3) {
        points[0] = point1;
        points[1] = point2;
        points[2] = point3;
    }

    Triangle(double x1, double y1, double x2, double y2, double x3, double y3) {
        this(new Point(x1, y1), new Point(x2, y2), new Point(x3, y3));
    }

    Triangle(Point[] points) {
        this.points = points;
    }

    public double getSide1() {
        return points[0].getDistance(points[1]);
    }

    public double getSide2() {
        return points[2].getDistance(points[1]);
    }

    public double getSide3() {
        return points[0].getDistance(points[2]);
    }

    public double getPerimeter() {
        return getSide1() + getSide2() + getSide3();
    }

    public double getArea() {
        double s = getPerimeter() / 2;
        return (Math.sqrt(s * (s - getSide1()) * (s - getSide2()) * (s - getSide3())));
    }

    @Override
    public String toString() {
        return "side1 -> " + getSide1() + "\n" +
                "side2 -> " + getSide2() + "\n" +
                "side3 -> " + getSide3() + "\n" +
                "Perimeter -> " + getPerimeter() + "\n" +
                "Area -> " + getArea();
    }
}
