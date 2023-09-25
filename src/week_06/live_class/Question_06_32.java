package week_06.live_class;

public class Question_06_32 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 0; i < 10000; i++) {
            boolean gameWin = playCraps();
            if (gameWin) {
                count++;
            }

        }
        System.out.println("Number Of Winning games : " + count);
    }

    public static boolean playCraps() {
        boolean result = true;
        int dice1 = rollDice();
        int dice2 = rollDice();

        System.out.println("You rolled " + dice1 + " || dice2-> " + dice2);

        if (isWin(dice1, dice2)) {
            System.out.println("You win!");

        } else if (isLose(dice1, dice2)) {
            System.out.println("You lose!");
            result = false;
        } else {
            int sum = dice1 + dice2;
            do {
                dice1 = rollDice();
                dice2 = rollDice();
                System.out.println("dice1 -> " + dice1 + " | " + "dice2 -> " + dice2);
                if (dice1 + dice2 == 7) {
                    System.out.println("You lose");
                    result = false;
                }
                if (dice1 + dice2 == sum) {
                    System.out.println("You win");
                }
            } while (sum != dice1 + dice2 && dice1 + dice2 != 7);
        }
        return result;
    }


    public static int rollDice() {
        return (int) (Math.random() * 6) + 1;
    }

    public static boolean isWin(int dice1, int dice2) {
        int sum = dice1 + dice2;
        return sum == 7 || sum == 11;
    }

    public static boolean isLose(int dice1, int dice2) {
        int sum = dice1 + dice2;
        return sum == 2 || sum == 3 || sum == 12;
    }
}
