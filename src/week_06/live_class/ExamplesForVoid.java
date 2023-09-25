package week_06.live_class;

public class ExamplesForVoid {
    public static void main(String[] args) {
//        System.out.print("The grade is ");
//        printGrade(78.5);
        int number = TestMax.max(5, 10);

        printGrade(105);
        printGrade(78.5);
        printGrade(59.5);
    }


    public static void printGrade(double grade) {
        if (grade > 100 || grade < 0) {
            System.out.println("Invalid Score!");
            return;
        }

        char result;
        if (grade >= 90) {
            result = 'A';
        } else if (grade >= 80.0) {
            result = 'B';
        } else if (grade >= 70.0) {
            result = 'C';
        } else if (grade >= 60.0) {
            result = 'D';
        } else {
            result = 'F';
        }
        System.out.println("The grade is " + result);
    }
}
