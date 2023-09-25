package week_06.live_class;

public class Max {
    public static void main(String[] args) {
        int n1 = 5;
        int n2 = 8;
        int intMax = max(n1, n2);
        System.out.println("int max -> " + intMax);

        double num1 = 5.19;
        double num2 = 2.17231;
        double doubleMax = max(num1, num2);
        System.out.println("double max -> " + doubleMax);
    }


    public static int max(int n1, int n2) {
        return n1 > n2 ? n1 : n2;
    }

    public static double max(double n1, double n2) {
        return n1 > n2 ? n1 : n2;
    }
}
