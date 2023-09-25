package week_06.exercise;

public class First100PrimeNumbers {
    public static void main(String[] args) {
        int count = 0;
        int number = 2;
        while (count < 1000) {
            if (isPrime(number)) {
                count++;
                System.out.printf("%5d", number);
                if(count % 10 == 0) {
                    System.out.println();
                }
            }
            number++;
        }
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
