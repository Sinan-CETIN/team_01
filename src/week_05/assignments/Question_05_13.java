package week_05.assignments;

public class Question_05_13 {
    public static void main(String[] args) {
        int number = 1;
        while (Math.pow(number, 3) < 12000) {
            number++;
        }
        System.out.println("The smallest n is -> " + --number);
    }
}

