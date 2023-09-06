package week_05.assignments;

import java.util.Scanner;

public class Question_05_09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of Students : ");
        int numberOfStudents = input.nextInt();
        int count = 1;

        String nameOfHighestScore = "";
        int highestScore = -1;

        String nameOfSecondHighestScore = "";
        int secondHighestScore = -1;

        while (count <= numberOfStudents) {
            System.out.println("Student : " + count);
            System.out.print("Name : ");

            // Using this [input.nextLine();] prevent error
            input.nextLine();

            String name = input.nextLine();
            System.out.print("Score : ");
            int score = input.nextInt();

            if (score > highestScore) {
                secondHighestScore = highestScore;
                nameOfSecondHighestScore = nameOfHighestScore;
                highestScore = score;
                nameOfHighestScore = name;
            } else if (score > secondHighestScore) {
                secondHighestScore = score;
                nameOfSecondHighestScore = name;
            }
            count++;
        }

        System.out.println("The highest scoring name - > " + nameOfHighestScore + " score -> " + highestScore);
        System.out.println("The Second highest scoring name - > " + nameOfSecondHighestScore + " score -> " + secondHighestScore);
    }
}
