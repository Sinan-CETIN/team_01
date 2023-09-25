package week_06.live_class;

public class TestMethodOverloading {
    public static void main(String[] args) {
        int i = 5;
        int j = 10;
        double number1 = 4.4;
        double number2 = 7.4;
        double number3 = 9.1;


        System.out.println(max(i, (double) j));
        System.out.println(max((double) i, j));
    }

    public static double max(int n1, double n2) {
        return (n1 > n2) ? n1 : n2;
    }

    public static double max(double n1, int n2) {
        return (n1 > n2) ? n1 : n2;
    }

    public static double max(double i, double j) {
        return (i > j) ? i : j;
    }

    public static double max(double i, double j, double k) {
        return max(max(i, j), k);
    }
}
