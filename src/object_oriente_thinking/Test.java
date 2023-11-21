package object_oriente_thinking;

import java.util.Arrays;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Course Name -> ");
        String courseName = input.nextLine();
        System.out.print("numberOf Students -> ");
        int numberOfStudents = input.nextInt();
        String[] students = new String[numberOfStudents];
        input.nextLine();

        for (int i = 0; i < students.length; i++) {
            System.out.println("Enter name -> ");
            students[i] = input.nextLine();
        }

        Course course = new Course(courseName, students);
        int option;
        do {
            System.out.println("Enter 1 for add, 2 for drop, any other tus for exit!");
            option = input.nextInt();
            input.nextLine();
            if (option == 1) {
                System.out.println("Enter name for add students ->");
                course.addStudents(input.nextLine());
            } else if (option == 2) {
                System.out.println("Enter name for drop students ->");
                course.dropStudents(input.nextLine());
            }
        } while (option == 1 || option == 2);

        System.out.println(course);

    }
}
