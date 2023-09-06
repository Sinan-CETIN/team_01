package week_05.assignments;

public class Question_05_18_PatternC {
    public static void main(String[] args) {
        for (int satir = 1; satir <= 6; satir++) {
            // satir icin bosluklari belirle ve  yazdir
            for (int i = 1; i < 7 - satir ; i++) {
                System.out.printf("%-2s", " ");
            }

            // satir icin sayilari yazdir
            for (int i = satir; i >= 1  ; i--) {
                System.out.printf("%-2d", i);
            }
            System.out.println();
        }
    }
}
