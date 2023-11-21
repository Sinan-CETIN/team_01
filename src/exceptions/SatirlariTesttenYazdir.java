package exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.Stack;

public class SatirlariTesttenYazdir {
    public static void main(String[] args) {

        String sourcePath = "Team_1.txt";
        String targetPath = "Tersten.txt";

        File sourceFile = new File(sourcePath);
        File targetFile = new File(targetPath);
        if (!sourceFile.exists()) {
            throw new RuntimeException("No Source File -> " + sourcePath);
        }

        if (targetFile.exists()) {
            throw new RuntimeException("We already have this target File -> " + sourcePath);
        }
        Stack<String> stringStack = new Stack<>();

        try {
            Scanner input = new Scanner(sourceFile);
            while (input.hasNext()) {
                String s = input.nextLine();
                stringStack.push(s);
            }
            input.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        try {
            PrintWriter output = new PrintWriter(targetFile);

            while (!stringStack.empty()) {
                output.println(stringStack.pop());
            }
            output.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}

