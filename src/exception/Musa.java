package exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Musa {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("src/exception/test.txt");

        try (Scanner input = new Scanner(file)) {
            String s = "";
            while (input.hasNext()) {
                s += input.nextLine();
                s += " musa\n";
            }
            System.out.println(s);
        }


    }
}

