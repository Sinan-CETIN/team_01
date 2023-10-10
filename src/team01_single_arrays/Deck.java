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
        int numberOfPick = 0; // denememizi sayan degisken

        // haveSuits herhangi bir suitten karta sahip olup olmadimizi kontrol ediyor.
        boolean[] haveSuits = new boolean[4];
        int index = 0;

        while (index < 4) {
            int card = pickOneCard(deck);
            numberOfPick++; // her cekilen kart bizim degiskenimizi bir arttiriyor

            int suitType = card / 13; // cekilen kartin suiti (sayi olarak)

            if (!haveSuits[suitType]) { // cekilen kart suiti bizde yoksa onu picke ekliyoruz.
                haveSuits[suitType] = true; // Cekilen kartin suitini true yaparak listemizde o suite sahip oldugumuzu gosteriyoruz.
                pick[index++] = card; // karti listemize ekliyoruz
            }
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
            String suit = getSuit(deck[i]);
            String number = getNumber(deck[i]);
            System.out.println(deck[i] + " -> " + number + " of " + suit);
        }
    }

    public static String getSuit(int cardNumber) {
        String[] suits = {"Spades", "Clubs", "Diamonds", "Hearts"};
        int index = cardNumber / 13;
        return suits[index];
    }

    public static String getNumber(int cardNumber) {
        String[] numbers = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Joker", "Queen", "King"};
        int index = cardNumber % 13;
        return numbers[index];
    }
}
