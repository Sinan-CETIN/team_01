package week_06.live_class;

public class Example_06_01 {
    public static void main(String[] args) {
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        for (int i = 0; i < 100; i++) {
            int result = getRandomNumber();
            switch (result) {
                case 0:
                    System.out.println("number is between 0 - 33");
                    count1++;
                    break;
                case 1:
                    System.out.println("number is between 34 - 66");
                    count2++;
                    break;
                case 2:
                    System.out.println("number is between 67 - 100");
                    count3++;
                    break;
            }

        }
        System.out.println("count1 -> " + count1);
        System.out.println("count2 -> " + count2);
        System.out.println("count3 -> " + count3);
    }

    public static int getRandomNumber() {
        int number = (int) (Math.random() * 100);
        System.out.println(number);
        if (number <= 33) {
            return 0;
        } else if (number <= 66) {
            return 1;
        } else {
            return 2;
        }
    }
}
