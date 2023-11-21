package exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Question_12_12 {
    public static void main(String[] args) throws FileNotFoundException {
        String path = "src/exception/";
        File file = new File(path);
        System.out.println("isDir -> " + file.isDirectory());

        File[] files = file.listFiles();

        for (File fileInExceptionDirectory : files) {
            Scanner input = new Scanner(fileInExceptionDirectory);
            String s = "";

            while(input.hasNext()) {
                s += input.nextLine() +"\n";
            }

            s = s.replaceAll("\\s*\\{", " {");
            System.out.println(s);
            PrintWriter output = new PrintWriter(fileInExceptionDirectory);
            output.println(s);
            output.close();
        }
    }
}

