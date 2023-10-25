package multi_dimensional_array;

import java.util.Scanner;

public class TokenGame1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char[][] gameStatus = new char[3][3];
        displayTable(gameStatus);
        char[] tokens = {'X', 'O'};

        do {
            int row = -1;
            int column = -1;

            do { // burasi gecerli bir row column degeri alana kadar kullaniciya soru soracak
                System.out.println("Enter row and column for token - " + tokens[0] + " -> ");
                row = input.nextInt();
                column = input.nextInt();
            } while (!suitablePlace(gameStatus, row, column));
            placeToken(gameStatus, tokens[0], row, column);
            swap(tokens);

            displayTable(gameStatus);
        } while (!isWin(gameStatus, tokens[1]) && havePlace(gameStatus));

        if (isWin(gameStatus, tokens[1])) {
            System.out.println(tokens[1] + " won the game!");
        } else {
            System.out.println("it is a draw!");
        }
    }

    public static void placeToken(char[][] table, char ch, int row, int column) {
        table[row][column] = ch;
    }


    public static boolean suitablePlace(char[][] array, int row, int column) {
        if (row < 0 || row >= array.length) {
            return false;
        }

        if (column < 0 || column >= array[0].length) {
            return false;
        }

        if (array[row][column] == 'X' || array[row][column] == 'O') {
            return false;
        }
        return true;
    }

    public static void swap(char[] array) {
        char temp = array[0];
        array[0] = array[1];
        array[1] = temp;
    }

    public static boolean isWin(char[][] array, char ch) {
        // rowlari kontrol edelim
        for (int i = 0; i < array.length; i++) {
            int count = 0;
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] == ch) {
                    count++;
                    if (count == 3) {
                        return true;
                    }
                }
            }
        }

        // columnlari kontrol edelim
        for (int column = 0; column < array[0].length; column++) {
            int count = 0;
            for (int row = 0; row < array.length; row++) {
                if (array[row][column] == ch) {
                    count++;
                    if (count == 3) {
                        return true;
                    }
                }
            }
        }

        // check for major diagonal
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i][i] == ch) {
                count++;
                if (count == 3) {
                    return true;
                }
            }
        }

        // check for subdiagonal
        count = 0;
        for (int row = 0, column = 2; row < array.length; row++, column--) {
            if (array[row][column] == ch) {
                count++;
                if (count == 3) {
                    return true;
                }
            }
        }


        return false;
    }

    public static void displayTable(char[][] array) {

        for (int i = 0; i < array.length; i++) {
            System.out.println("--------------");
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] == 'X') {
                    System.out.print("| X ");
                } else if (array[i][j] == 'O') {
                    System.out.print("| O ");
                } else {
                    System.out.print("|   ");
                }
            }
            System.out.println("|");
        }
        System.out.println("--------------");
    }

    public static boolean havePlace(char[][] table) {
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                if (table[i][j] == '\u0000') {
                    return true;
                }
            }
        }
        return false;
    }
}
