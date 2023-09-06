package week_05.assignments;

import java.util.Scanner;

public class Question_05_22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Loan amount : ");
        double loanAmount = input.nextDouble();

        System.out.print("Number Of years : ");
        int numberOfYears = input.nextInt();

        System.out.print("Annual Interest Rate : ");
        double annualInterestRate = input.nextDouble();

        double montlyInterestRate = annualInterestRate / 1200;

        double montlyPayment = loanAmount * montlyInterestRate / (1 - (1 / Math.pow(1 + montlyInterestRate, numberOfYears * 12)));
        System.out.printf("Montly payment : %.2f\n", montlyPayment);
        double totalPayment = montlyPayment * numberOfYears * 12;
        System.out.printf("Total Payment : %.2f\n" , totalPayment);

        System.out.printf("%-25s%-25s%-25s%-25s\n", "Payment#", "Interest", "Principal", "Balance");


        for (int i = 0; i < numberOfYears * 12; i++) {
            double interest = montlyInterestRate * loanAmount;
            double principal = montlyPayment - interest;
            loanAmount -= principal;
            System.out.printf("%-25d%-25.2f%-25.2f%-25.2f\n", (i + 1), interest, principal, loanAmount);
        }

        MultiplicationTable.printMultiplicationTable();
    }
}
