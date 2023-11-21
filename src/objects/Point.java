package objects;

public class Point {
    private double x;
    private double y;

    public Point() {
        this.x = 0;
        this.y = 0;
    }


    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return this.x;
    }

    public double getY() {
        return this.y;
    }

    public double distance(Point p) {
        return Math.sqrt(Math.pow(this.x - p.getX(), 2) +
                Math.pow(this.y - p.getY(), 2));
    }

    public static double getDistance(Point p1, Point p2) {
        return p2.distance(p1);
    }

}
