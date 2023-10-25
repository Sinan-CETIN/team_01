package multi_dimensional_array;

import java.util.Scanner;

public class Question_08_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of banks ->");
        int numberOfBanks = input.nextInt();
        System.out.print("Enter the limit");
        double limit = input.nextDouble();

        double[][] banks = new double[numberOfBanks][];
        getInfoBanks(banks, input);
        boolean[] safeBanks = createSafeBanks(numberOfBanks);
        uptadeBanksSafety(banks, safeBanks, limit);
        displayUnsafeBanks(safeBanks);
    }

    public static void displayUnsafeBanks(boolean[] bankSafety) {
        System.out.print("Unsafe banks ->");
        for (int i = 0; i < bankSafety.length; i++) {
            if (!bankSafety[i]) {
                System.out.print(i + " ");
            }
        }
    }

    public static void uptadeBanksSafety(double[][] banks, boolean[] safety, double limit) {
        boolean needNext = true;

        while (needNext) {
            int count = 0;
            for (int i = 0; i < banks.length; i++) {
                double sum = banks[i][0];
                for (int j = 2; j < banks[i].length; j += 2) {
                    if (safety[(int) banks[i][j]]) {
                        sum += banks[i][j + 1];
                    }
                }
                if (sum < limit && safety[i]) {
                    safety[i] = false;
                    count++;
                }
            }
            if (count == 0) {
                needNext = false;
            }

        }
    }

    public static boolean[] createSafeBanks(int size) {
        boolean[] result = new boolean[size];
        for (int i = 0; i < result.length; i++) {
            result[i] = true;
        }
        return result;
    }

    public static void getInfoBanks(double[][] banks, Scanner input) {
        for (int i = 0; i < banks.length; i++) {
            System.out.print("Enter bank" + i + " balance ->");
            double balance = input.nextDouble();
            System.out.print("Enter number of banks which borrow money here ->");
            int numberOfBanksBorrowed = input.nextInt();
            banks[i] = new double[numberOfBanksBorrowed * 2 + 2];
            banks[i][0] = balance;
            banks[i][1] = numberOfBanksBorrowed;
            for (int j = 2; j < banks[i].length; j++) {
                if (j % 2 == 0) {
                    System.out.println("Enter bank id->");
                    int bankId = input.nextInt();
                    banks[i][j] = bankId;
                } else {
                    System.out.println("Enter the amount ->");
                    double amount = input.nextDouble();
                    banks[i][j] = amount;
                }
            }

        }
    }
}
