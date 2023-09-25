package week_06.live_class;

public class Exercise_06_01 {
    public static void main(String[] args) {
        int number1 = 1;

        System.out.println("Sum from 1 to 10 is " + sumOfNumber1ToNumber2(number1, 10));
        System.out.println("Sum from 20 to 37 is " + sumOfNumber1ToNumber2(20, 37));
        System.out.println("Sum from 35 to 49 is " + sumOfNumber1ToNumber2(35, 49));
    }

    public static int sumOfNumber1ToNumber2(int n1, int n2) {
        int result = 0;
        for (int i = n1; i <= n2; i++) {
            result += i;
        }
        return result;
    }
}

