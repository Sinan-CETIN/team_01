package week_06.live_class;

public class ReturnExamples {
    public static void main(String[] args) {
        int sum = sum10Number();
        System.out.println("sum of 10 random number -> " + sum);
    }

    public static int sum10Number() {
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            int num = (int) (Math.random() * 100);
            System.out.println((i + 1) + " --> " + num);
            sum += num;
            if (num > 70 && num < 80 && i != 9) {
                System.out.println("toplamda 10 tane sayi toplanilmadi!");
                return sum;
            }
        }

        System.out.println("toplamda 10 tane sayi toplanildi");
        return sum;
    }
}
