package exception;

public class IllegalTriangleException extends Exception {

    private double side1;
    private double side2;
    private double side3;
    public IllegalTriangleException(double side1, double side2, double side3) {
        super("Kardes bu kenarlarla ucgen mi olur -> " + side1 + ", " + side2 + ", " + side3);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return this.side1;
    }

    public double getSide2() {
        return this.side2;
    }

    public double getSide3() {
        return this.side3;
    }
}

