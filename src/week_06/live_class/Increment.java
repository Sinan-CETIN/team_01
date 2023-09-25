package week_06.live_class;

public class Increment {
    public static void main(String[] args) {
        int x = 1;
        System.out.println("Before invoking increment method x -> " + x);
        increment(x);
        System.out.println("After  invoking increment method x -> " + x);

    }

    public static void increment(int n) {
        n++;
        System.out.println("n inside the method n-> " + n);
    }
}
