package military;

import java.util.Scanner;

public class Example1234221 {
    public static void main(String[] args) throws InterruptedException {
        Human human = new Human("Sinan", 27, Human.MALE, false, true);
        human.setAskerlikYaptimi(false);

        if (human.isNeedCelb()) {
            Military military = new Military(human);
            military.sendCelbKagidi();
        } else {
            System.out.println("askerligini yapmis!");
        }
    }
}
