package abstract_classes;

public class Rational extends Number implements Comparable<Rational> {

    private long numerator;
    private long denominator;


    public Rational() {
        this(0, 1);
    }


    public Rational(long numerator, long denominator) {
        long gcd = gcd(numerator, denominator);
        this.numerator = ((denominator > 0) ? 1 : -1) * numerator / gcd;
        this.denominator = Math.abs(denominator / gcd);
    }

    private static long gcd(long num1, long num2) {
        long gcd = 1;
        long possibleGcd = 2;
        while (possibleGcd <= Math.max(Math.abs(num1), Math.abs(num2))) {
            if (num1 % possibleGcd == 0 && num2 % possibleGcd == 0) {
                gcd = possibleGcd;
            }
            possibleGcd++;
        }
        return gcd;
    }

    @Override
    public int intValue() {
        return (int) doubleValue();
    }

    @Override
    public long longValue() {
        return (long) (doubleValue());
    }

    @Override
    public float floatValue() {
        return (float) doubleValue();
    }

    @Override
    public double doubleValue() {
        return this.numerator * 1.0 / this.denominator;
    }


    public long getNumerator() {
        return numerator;
    }

    public void setNumerator(long numerator) {
        this.numerator = numerator;
    }

    public long getDenominator() {
        return denominator;
    }

    public void setDenominator(long denominator) {
        this.denominator = denominator;
    }

    public Rational add(Rational secondNumber) {
        long n = numerator * secondNumber.getDenominator() +
                denominator * secondNumber.getNumerator();
        long d = denominator * secondNumber.getDenominator();
        return new Rational(n, d);
    }

    public Rational substract(Rational secondNumber) {
        long n = this.numerator * secondNumber.getDenominator() -
                secondNumber.getNumerator() * this.denominator;
        long d = denominator * secondNumber.getDenominator();
        return new Rational(n, d);
    }

    public Rational multiply(Rational secondNumber) {
        long n = this.numerator * secondNumber.getNumerator();
        long d = this.denominator * secondNumber.getDenominator();
        return new Rational(n, d);
    }

    public Rational Divide(Rational secondNumber) {
        long n = this.numerator * secondNumber.getDenominator();
        long d = this.denominator * secondNumber.getNumerator();
        return new Rational(n, d);
    }

    @Override
    public int compareTo(Rational o) {
        return this.doubleValue() > o.doubleValue() ? 1 :
                this.doubleValue() == o.doubleValue() ? 0 : -1;
    }

    public boolean equals(Object obj) {

        if (this.substract((Rational) obj).getNumerator() == 0) {
            return true;
        }

        return false;
    }

    public String toString() {
        return this.getNumerator() + "\\" + this.getDenominator();
    }
}

