package exceptions;

import java.io.File;
import java.io.PrintWriter;

public class Test {
    public static final String START_PATH = "src/";

    public static void main(String[] args) {
        String startPath = START_PATH + "students";
        FileUtils.createFolder(startPath);

        for (int i = 1; i < 50; i++) {
            // create 50 txt files
            String name = startPath + "/file_" + (i < 10 ? "0" : "") + i;
            File file = FileUtils.createTextFile(name);
            System.out.println(name);
            try {
                PrintWriter output = new PrintWriter(file);
                output.println(name);
                output.close();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }

    }
}

