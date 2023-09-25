import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of lines : ");
        int numberOfLines = input.nextInt();

        for (int satir = 1; satir <= numberOfLines; satir++) {
            // ilk basta bosluklar
            for (int i = 1; i < satir; i++) {
                System.out.print("  ");
            }

            // azalan sayilar
            for (int i = numberOfLines - satir + 1; i >= 1; i--) {
                System.out.print(i + " ");
            }
            // artan sayilar
            for (int i = 2; i <= numberOfLines - satir + 1; i++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}