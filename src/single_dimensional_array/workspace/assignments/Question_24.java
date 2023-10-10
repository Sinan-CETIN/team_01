package single_dimensional_array.workspace.assignments;

public class Question_24 {
    public static void main(String[] args) {
        int[] deck = createDeck();
        shuffle(deck);
        int[] picks = createPick();
        int numberOfTry = pick4Cards(deck, picks);

        displayPicks(picks);
        System.out.println("Number of try -> " + numberOfTry);
    }

    private static int[] createPick() {
        int[] result = new int[4];
        for (int i = 0; i < result.length; i++) {
            result[i] = -1;
        }
        return result;
    }


    public static int[] createDeck() {
        int[] result = new int[52];
        for (int i = 0; i < result.length; i++) {
            result[i] = i;
        }

        return result;
    }

    public static void shuffle(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int index = (int) (Math.random() * arr.length);
            int temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
        }
    }

    public static int pick4Cards(int[] deck, int[] picks) {
        int numberOfPicks = 0;

        boolean[] haveSuits = new boolean[4];

        int count = 0;
        while(count < picks.length) {int card = pickCard(deck);
            numberOfPicks++;

            int suitType = card / 13;
            if(!haveSuits[suitType]) {
                haveSuits[suitType] = true;
                picks[count++] = card;
            }
        }
        return numberOfPicks;
    }

    public static int pickCard(int[] deck) {
        int index = (int)(Math.random() * deck.length);
        return deck[index];
    }

    public static void displayPicks(int[] deck) {
        for (int i = 0; i < deck.length; i++) {
            String suit = getSuit(deck[i]);
            String number = getNumber(deck[i]);
            System.out.println(number + " of " + suit);
        }
    }

    public static String getSuit(int cardNumber) {
        String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
        return suits[cardNumber / 13];
    }

    public static String getNumber(int cardNumber) {
        String[] numbers = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Joker","Queen", "King"};
        return numbers[cardNumber % 13];
    }
}
