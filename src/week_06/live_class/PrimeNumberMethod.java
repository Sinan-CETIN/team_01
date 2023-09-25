package week_06.live_class;

import java.util.Scanner;

public class PrimeNumberMethod {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter prime number counts -> ");
        int numberOfPrimes = input.nextInt();

        System.out.println("The first" + numberOfPrimes + " prime numbers : ");
        printPrimeNumbers(numberOfPrimes);
    }

    public static void printPrimeNumbers(int numberOfPrimes) {
        final int NUMBER_OF_PRIMES_PER_LINE = 10;
        int count = 0;
        int number = 2;

        while (count < numberOfPrimes) {
            if (isPrime(number)) {
                count++;
                System.out.printf("%-5d", number);
                if (count % NUMBER_OF_PRIMES_PER_LINE == 0) {
                    System.out.println();
                }
            }
            number++;
        }
    }

    public static boolean isPrime(int number) {
        for (int i = 2; i <= number / 2; i++) {
            if(number % i  == 0){
                return false;
            }
        }
        return true;
    }
}
