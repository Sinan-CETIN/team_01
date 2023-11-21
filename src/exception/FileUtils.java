package exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileUtils {
    public static void createFolder(String path) {
        new File(path).mkdir();
    }

    public static File createTextFile(String name) {
        return new File(name+",txt");
    }

    public static void deleteDirectory(String path) {
        System.out.println(new File(path).delete());
    }

    public static void changeString(String ex, String newStr, File file) {
        try {
            Scanner input = new Scanner(file);
            StringBuilder stringBuilder = new StringBuilder();
            while(input.hasNext()) {
                String s = input.nextLine();
                stringBuilder.append(s.replaceAll(ex,newStr) + "\n");
            }

            PrintWriter output = new PrintWriter(file);
            output.println(stringBuilder);
            output.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}

