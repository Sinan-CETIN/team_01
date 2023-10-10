package week_01;

public class Deck {
    public static void main(String[] args) {
        int[] deck = createDeck();
        shuffle(deck);
        int[] picks = new int[4];
        int numberOfPicks = pick4Cards(deck, picks);
        displayDeck(picks);
        System.out.println("Number Of Picks -> " + numberOfPicks);
    }

    public static int pick4Cards(int[] deck, int[] pick) {
        int numberOfPick = 0;

        boolean[] haveSuits = new boolean[4];

//        for (int i = 0; i < pick.length; i++) {
//            pick[i] = Integer.MIN_VALUE;
//        }

        int index = 0;
        while (index < 4) {
            int card = pickOneCard(deck);
            int indexOfBoolean = card / 13;
            numberOfPick++;
            if (!haveSuits[indexOfBoolean]) {
                haveSuits[indexOfBoolean] = true;
                pick[index++] = card;
            }
//            if (!contains(pick, card)) {
//                  pick[index++] = card;
//            }
        }


        return numberOfPick;
    }

    public static boolean contains(int[] deck, int card) {
        for (int i = 0; i < deck.length; i++) {
            if ((deck[i] / 13) == (card / 13)) {
                return true;
            }
        }
        return false;
    }

    public static int pickOneCard(int[] deck) {
        int index = (int) (Math.random() * deck.length);
        return deck[index];
    }

    public static void shuffle(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int index = (int) (Math.random() * arr.length);
            int temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
        }
    }

    public static int[] createDeck() {
        int[] deck = new int[52];
        for (int i = 0; i < deck.length; i++) {
            deck[i] = i;
        }
        return deck;
    }

    public static void displayDeck(int[] deck) {
        for (int i = 0; i < deck.length; i++) {
            String name = getName(deck[i]);
            System.out.println(deck[i] + " -> " + name);
        }
    }

    public static String getName(int number) {
        String[] suits = {"Spades", "Clubs", "Diamonds", "Hearts"};
        String[] numbers = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Joker", "Queen", "King"};
        String result = numbers[(number % 13)] + " of " + suits[(number / 13)];
        return result;
    }
}
