package week_06.live_class;

public class TestPassByValue {
    public static void main(String[] args) {
        int num1 = 1;
        int num2 = 2;
        System.out.println("Before invoking swap method num1 -> " + num1 + " and num2 -> " + num2);

        // swap methodu
        swap(num1,num2);

        System.out.println("After invoking swap method num1 -> " + num1 + " and num2 -> " + num2);
    }

    public static void swap(int n1, int n2) {
        System.out.println("\t Inside swap method");
        System.out.println("\t\t Before swapping n1 -> " + n1 + " and n2-> " + n2);

        // swap n1 and n2
        int temp = n1;
        n1 = n2;
        n2 = temp;

        System.out.println("\t\t After swapping n1 -> " + n1 + " and n2-> " + n2);
    }
}
