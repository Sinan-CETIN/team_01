package exceptions;

import java.io.File;

public class DeleteTest {
    public static void main(String[] args) {
        File file = new File("src/students");
        System.out.println("Directory-> " + file.isDirectory());
        File[] files = file.listFiles();
        for (File f : files) {
            System.out.printf("", f.delete());
        }
        file.delete();
        FileUtils.deleteDirectory("src/students");
    }
}

