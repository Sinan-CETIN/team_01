package multi_dimensional_array;

import java.util.Scanner;

public class TokenGame {
    public static void main(String[] args) {
        char[][] gameStatus = new char[3][3];

        displayTable(gameStatus);

        char[] tokens = {'X', 'O'};

        do {
            int row = -1;
            int column = -1;
            do {
                row = askRow(tokens[0]);
                column = askColumn(tokens[0]);
            } while (!availablePlace(gameStatus, row, column));
            placeToken(gameStatus, tokens[0], row, column);
            displayTable(gameStatus);
            swapToken(tokens);
        } while (!isWin(gameStatus, tokens[1]) && havePlace(gameStatus));

        if (isWin(gameStatus, tokens[1])) {
            System.out.println(tokens[1] + " player won!");
        } else {
            System.out.println("It is a draw!");
        }


    }

    public static void displayTable(char[][] table) {
        System.out.println("--------------");
        for (int i = 0; i < table.length; i++) {
            System.out.print("|");
            for (int j = 0; j < table[i].length; j++) {
                if (table[i][j] == 'X') {
                    System.out.print(" X |");
                } else if (table[i][j] == 'O') {
                    System.out.print(" O |");
                } else {
                    System.out.print("   |");
                }
            }
            System.out.println("\n--------------");

        }
    }

    public static int askRow(char token) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter row for " + token + " ->");
        int row = input.nextInt();
        return row;
    }

    public static int askColumn(char token) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter column for " + token + " ->");
        int column = input.nextInt();
        return column;
    }

    public static boolean availablePlace(char[][] table, int row, int column) {
        if (row < 0 || row >= table.length) {
            return false;
        }
        if (column < 0 || column >= table[0].length) {
            return false;
        }

        if (table[row][column] == 'X' || table[row][column] == 'O') {
            return false;
        }
        return true;
    }


    // placeToken(gameStatus, token[0], row, column);
    public static void placeToken(char[][] table, char token, int row, int column) {
        table[row][column] = token;
    }

    public static void swapToken(char[] tokens) {
        char temp = tokens[0];
        tokens[0] = tokens[1];
        tokens[1] = temp;
    }

    public static boolean isWin(char[][] table, char token) {
        boolean result = false;
        for (int i = 0; i < table.length; i++) {
            result = checkRow(table[i], token);
            if (result) {
                break;
            }
        }

        if (result) {
            return result;
        }

        for (int i = 0; i < table[0].length; i++) {
            int count = 0;
            for (int j = 0; j < table.length; j++) {
                if (table[j][i] == token) {
                    count++;
                    if (count == 3) {
                        return true;
                    }
                }
            }
        }

        int count = 0;
        for (int i = 0; i < table.length; i++) {
            if (table[i][i] == token) {
                count++;
                if (count == 3) {
                    return true;
                }
            }
        }

        count = 0;
        for (int i = 0, j = 2; i < table.length; i++, j--) {
            if (table[i][j] == token) {
                count++;
                if (count == 3) {
                    return true;
                }
            }
        }

        return false;
    }

    public static boolean checkRow(char[] row, char token) {
        for (int i = 0; i < row.length; i++) {
            if (row[i] != token) {
                return false;
            }
        }
        return true;
    }

    public static boolean havePlace(char[][] gameStatus) {
        for (int i = 0; i < gameStatus.length; i++) {
            for (int j = 0; j < gameStatus[i].length; j++) {
                if (gameStatus[i][j] != 'X' && gameStatus[i][j] != 'O') {
                    return true;
                }
            }
        }
        return false;
    }
}
