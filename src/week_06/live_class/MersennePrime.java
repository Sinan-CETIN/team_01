package week_06.live_class;

public class MersennePrime {
    public static void main(String[] args) {
        System.out.printf("%-15s%-15s\n", "p", "2^p-1");
        System.out.println("----------------------------");
        for (int i = 2; i <= 31; i++) {
            if (isMersennePrime(i)) {
                System.out.printf("%-15d%-15d\n", i, (int)(Math.pow(2, i) - 1));
            }
        }
    }

    public static boolean isMersennePrime(int number) {
        return isPrime(number) && isPrime((int) (Math.pow(2, number) - 1));
    }

    public static boolean isPrime(int number) {
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
