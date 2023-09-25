package week_06.exercise;


public class Test {
    public static void main(String[] args) {
        int max = max(3, 5);

    }

    private static int max(int i, int i1) {
        int number = i * i1;
        int result = multiply(number, 3);
        result = divide(result, 5);
        return result;
    }

    private static int divide(int number, int i) {
        return number / 5;
    }

    private static int multiply(int number, int i) {
        return number * i;
    }
}
