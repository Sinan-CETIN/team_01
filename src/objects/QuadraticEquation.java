package objects;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    public QuadraticEquation(){
        this(0,0,0);
    }
    public QuadraticEquation(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return this.a;
    }

    public double getB() {
        return this.b;
    }

    public double getC() {
        return this.c;
    }

    public double getDiscriminant() {
        return Math.pow(this.b, 2) - (4 * this.a * this.c);
    }

    public double getRoot1() {
        if (this.getDiscriminant() == 0) {
            return 0;
        }
        return (-b + Math.sqrt(this.getDiscriminant())) / (2 * this.a);
    }

    public double getRoot2() {
        if (this.getDiscriminant() == 0) {
            return 0;
        }

        return (-b - Math.sqrt(this.getDiscriminant())) / (2 * this.a);
    }


    public String toString() {
        if (this.getDiscriminant() == 0) {
            return "This equation has no real root!";
        } else {
            return "root1 -> " + this.getRoot1() + "\n" +
                    "root2 -> " + this.getRoot2();
        }
    }
}
