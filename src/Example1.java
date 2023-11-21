import java.util.Scanner;

public class Example1 {
    public static void main(String[] args) {
        // 1
        // 22
        // 333
        // 1 2 3 4 . . . . . n

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number -> ");
        int number = input.nextInt();
        displayPatternA(number);
        displayPatternB(number);
    }

    public static void displayPatternA(int n) {
        for (int i = 1; i <= n; i++) {
            // satiri yazdir
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            // asagi in
            System.out.println();
        }
    }

    public static void displayPatternB(int n) {
        for (int i = n; i >= 1; i--) {
            // satir yazdir
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            // asagi in
            System.out.println();
        }
    }
}
