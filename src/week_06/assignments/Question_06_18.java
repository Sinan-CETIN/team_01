package week_06.assignments;

import java.util.Scanner;

public class Question_06_18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter password -> ");
        String password = input.nextLine();


        System.out.println((isValidPassword(password) ? "Valid" : "Invalid") + " password");
    }

    public static boolean isValidPassword(String str) {
        if (!isLenghtValid(str)) {
            System.out.println("sifrede 8 karakter yok");
            return false;
        }

        if (!isDigitOrLetter(str)) {
            System.out.println("sifre sadece sayi ve harf icerebilir");
            return false;
        }

        if (!haveAtLeastTwoNumber(str)) {
            System.out.println("sifrede en az 2 sayi olmasi gerekiyor!");
            return false;
        }
        return true;
    }

    public static boolean isLenghtValid(String str) {
        return str.length() >= 8;
    }

    public static boolean isDigitOrLetter(String str) {
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            boolean isValidCharacter = Character.isLetterOrDigit(ch);
            if (!isValidCharacter) {
                return false;
            }
        }
        return true;
    }

    public static boolean haveAtLeastTwoNumber(String password) {
        int count = 0;
        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);

            if(ch >= '0' && ch <= '9') {
                count++;
                if(count == 2) {
                    return true;
                }
            }

        }
        return false;
    }


}
