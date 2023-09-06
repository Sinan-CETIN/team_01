package week_05.assignments;

public class Question_05_03 {
    public static void main(String[] args) {
        final double KILO_TO_POUNDS = 2.2;

        System.out.printf("%-10s%10s\n", "Kilogram", "Pounds");
        for (int kilograms = 1; kilograms <= 199; kilograms += 2) {
            double pounds = kilograms * KILO_TO_POUNDS;
            System.out.printf("%-10d%10.1f\n", kilograms, pounds);
        }
    }
}
