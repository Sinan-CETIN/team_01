package exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class StringDegistir {
    public static void main(String[] args) {
        String sourcePath = "Tersten.txt";
        String exString = "Cello";
        String newString = "Kral";

        File file = new File(sourcePath);

        if (!file.exists()) {
            throw new RuntimeException("File path -> " + sourcePath + " doesn't exists!");
        }


        try {
            Scanner input = new Scanner(file);
            StringBuilder stringBuilder = new StringBuilder();
            while (input.hasNext()) {
                String s = input.nextLine();
                stringBuilder.append(s.replaceAll(exString, newString) + "\n");
            }

            PrintWriter output = new PrintWriter(file);
            output.println(stringBuilder);
            output.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}

