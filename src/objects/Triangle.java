package objects;

public class Triangle {
    Point p1;
    Point p2;
    Point p3;

    public Triangle(Point p1, Point p2, Point p3) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    public Point getP1() {
        return this.p1;
    }

    public Point getP2() {
        return this.p2;
    }

    public Point getP3() {
        return this.p3;
    }


    public double side1() {
        return p1.distance(p2);
    }

    public double side2() {
        return p1.distance(p3);
    }

    public double side3() {
        return p2.distance(p3);
    }

    public double getPerimeter() {
        return this.side1() + this.side2() + this.side3();
    }

    public static double getPerimeter(Triangle triangle) {
        return triangle.getPerimeter();
    }

    public double getArea() {
        double s = this.getPerimeter() / 2;
        return Math.sqrt(s * (s - this.side1()) * (s - this.side2()) * (s - this.side3()));
    }
}
