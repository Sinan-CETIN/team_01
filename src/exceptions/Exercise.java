package exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exercise {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("src/exception");
        System.out.println("dir -> " + file.isDirectory());
        File[] listOfJavaCodes = file.listFiles();

        for (File f : listOfJavaCodes) {
            try (Scanner input = new Scanner(f)) {
                StringBuilder stringBuilder = new StringBuilder();
                while(input.hasNext()) {
                    stringBuilder.append(input.nextLine() + "\n");
                }
                System.out.println(stringBuilder);
                System.out.println("\n\nXXXXXXXXXXXXXXX\n\n");
            }
        }
    }
}

