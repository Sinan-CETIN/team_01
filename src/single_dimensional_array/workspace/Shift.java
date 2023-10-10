package single_dimensional_array.workspace;

public class Shift {
    public static void main(String[] args) {
        int[] deck = createADeck();
        System.out.println("Before Shuffling");
        displayDeck(deck);

        shiftArray(deck);
        //shuffleDeck(deck);
        System.out.println("\n+++++++++++++++++\n");
        System.out.println("After Shuffling");
        displayDeck(deck);
    }


    public static int[] createADeck() {
        int[] deck = new int[52];
        for (int i = 0; i < deck.length; i++) {
            deck[i] = i;
        }
        return deck;
    }

    public static void displayDeck(int[] arr) {
        String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
        String[] numbers = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Joker", "Queen", "King"};
        for (int i = 0; i < arr.length; i++) {
            String suit = suits[arr[i] / 13];
            String number = numbers[arr[i] % 13];
            System.out.println("Card number is " + arr[i] + ": " + number + " of " + suit);
        }
    }

    public static void shuffleDeck(int[] deck) {
        for (int i = 0; i < deck.length; i++) {
            int randomIndex = (int)(Math.random() * deck.length);
            int temp = deck[i];
            deck[i] = deck[randomIndex];
            deck[randomIndex] = temp;
        }
    }

    private static void swapRandomElementInArray(int[] array) {
        int element1 = (int) (Math.random() * array.length);
        int element2 = (int) (Math.random() * array.length);
        System.out.println("element 1 = " + element1);
        System.out.println("element 2 = " + element2);
        int temp = array[element1];
        array[element1] = array[element2];
        array[element2] = temp;
    }

    public static void putRandomItemIntoArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 10);

        }
    }

    public static void displayArray(int[] arr) {
        System.out.print("{");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                System.out.println(arr[i] + "}");
            } else {
                System.out.print(arr[i] + ", ");
            }
        }
    }

    public static void shiftArray(int[] arr) {
        int temp = arr[arr.length - 1];

        for (int i = arr.length - 1; i >= 1; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = temp;
    }
}
