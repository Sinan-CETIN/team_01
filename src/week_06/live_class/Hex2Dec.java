package week_06.live_class;

import java.util.Scanner;

public class Hex2Dec {
    public static void main(String[] args) {
        // kullanici hex deger giricek
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a hex value -> ");
        String hexValue = input.nextLine();
        hexValue = hexValue.toUpperCase();

        if (!isHexValue(hexValue)) {
            System.out.println("Invalid hexValue -> " + hexValue);
            System.exit(1);
        }


        int decimalValueOfHex = hex2Dec(hexValue);


        System.out.println("The decimal value for hex number " + hexValue + " is " + decimalValueOfHex);
    }

    public static boolean isHexValue(String hex) {
        for (int i = 0; i < hex.length(); i++) {
            char ch = hex.charAt(i);
            if (!(('A' <= ch && ch <= 'F') || ('0' <= ch && ch <= '9'))) {
                return false;
            }
        }
        return true;
    }

    public static int hex2Dec(String hex) {
        int pow = 0;
        int decimal = 0;
        for (int i = hex.length() - 1; i >= 0; i--) {
            char ch = hex.charAt(i);
            int valueOfHex = hexCharToDecimal(ch);
            decimal += valueOfHex * (int) Math.pow(16, pow);
            pow++;
        }

        return decimal;
    }

    public static int hexCharToDecimal(char ch) {
        // F - 16  A - 10   2 - 2 - 3- 3-

        int result = 0;
        if ('A' <= ch && ch <= 'F') {
            result = ch - 'A' + 10;
        } else {
            result = ch - '0';
        }
        return result;

    }
}
