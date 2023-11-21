package exceptions;
//
// /Users/Sinan/inar-workspace/team_01/src/exception/DeleteTest.java
// Users, Sinan  exception ;          DeleteTest.java

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class PackageNameChanger {
    public static void main(String[] args) throws FileNotFoundException {

        String classPath = "src/exception/DeleteTest.java";
        File exceptionDirectory = new File(classPath);
        String absolutePath = exceptionDirectory.getAbsolutePath();

//        String[] arrayString = absolutePath.split("/");
//        String packageName = arrayString[arrayString.length - 2];
//        System.out.println("isDirectory -> " + exceptionDirectory.isFile());

        File[] javaCodes = exceptionDirectory.listFiles();

        for (File code : javaCodes) {
            Scanner input = new Scanner(code);
            String s = "";

            while (input.hasNext()) {
                s += input.nextLine() + "\n";
            }

            s = s.replaceAll("package exception;", "package exception;");
            PrintWriter output = new PrintWriter(code);
            output.println(s);
            output.close();
        }
    }
}

