package week_06.live_class;

import java.util.Scanner;

public class Question_06_18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a password : ");
        String password = input.nextLine();

        System.out.println((isValidPassword(password) ? "Valid" : "Invalid") + " Password");
    }

    public static boolean isValidPassword(String password) {
        boolean result = true;
        if (!isValidLegth(password)) {
            System.out.println("Password dont have at least 8 character!");
            result = false;
        }
        if (!isPasswordOnlyContainsDigitOrLetter(password)) {
            System.out.println("Password can contain only digit or letter!");
            result = false;
        }

        if (!hasAtLeastTwoDigit(password)) {
            System.out.println("Password must include at least 2 numbers!");
            result = false;
        }

        return result;
    }

    public static boolean isValidLegth(String password) {
       return password.length() >= 8;
    }

    public static boolean isPasswordOnlyContainsDigitOrLetter(String password) {
        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);
            // Character.isLetterOrDigit(ch)
            if (!((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z') || (ch >= '0' && ch <= '9'))) {
                return false;
            }
        }
        return true;
    }

    public static boolean hasAtLeastTwoDigit(String password) {
        int count = 0;
        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);
            if (ch >= '0' && ch <= '9') {
                count++;
                if(count == 2 ){
                    return true;
                }
            }
        }

        return false;
    }
}
