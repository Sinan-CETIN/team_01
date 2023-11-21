package exceptions;

public class Triangle {
    private double side1;
    private double side2;
    private double side3;

    public Triangle() throws IllegalTriangleException {
        this(2, 2, 2);
    }

    public Triangle(double side1, double side2, double side3) throws IllegalTriangleException {
        if (!checkSides(side1, side2, side3)) {
            throw new IllegalTriangleException(side1, side2, side3);
        }
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getPerimeter() {
        return this.side1 + this.side2 + this.side3;
    }

    public double getArea() {
        double s = this.getPerimeter() / 2;
        return Math.sqrt(s * (s - this.side1) * (s - this.side2) * (s - this.side3));
    }

    @Override
    public String toString() {
        return "Area -> " + this.getArea() + "\n" +
                "Perimeter -> " + this.getPerimeter() + "\n" +
                "Sides - > " + this.side1 + ", " + this.side2 + ", " + this.side3;
    }

    private static boolean checkSides(double side1, double side2, double side3) {
        return ((side1 < side2 + side3) && (side2 < side1 + side3) && (side3 < side1 + side2));
    }
}

