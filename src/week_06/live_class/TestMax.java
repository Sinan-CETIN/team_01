package week_06.live_class;

public class TestMax {
    public static void main(String[] args) {
        int i = 2;
        int j = 5;
        int k = max(i, j);


        System.out.println("The maximum of " + i + " and " + j + " is " + k);
    }

    public static int max(int i, int j) {
        int result;
        if (i > j) {
            result = i;
        } else {
            result = j;
        }
        return result;
    }


}
