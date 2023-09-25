package week_06.live_class;

public class StackOverFlowExample {
    public static void main(String[] args) {
        String message = "message";
        print(message, 1);
    }

    public static void print(String message, int count) {
        // stackoverflow example
        System.out.println(count + " " + message);
        count++;
        print(message, count);
    }
}
