import java.io.File;
import java.util.ArrayList;
import java.util.Stack;

public class FileCounter {
    public static void main(String[] args) {
        File file = new File("src");
        int count = 0;
        ArrayList<File> directoryList = new ArrayList<>();
        directoryList.add(file);

        ArrayList<String> directoryNameList = new ArrayList<>();
        ArrayList<String> fileNameList = new ArrayList<>();

        while (!directoryList.isEmpty()) {
            File f = directoryList.remove(0);
            File[] files = f.listFiles();

            for (File subFile : files) {
                if (subFile.isDirectory()) {
                    directoryList.add(subFile);
                }
                if (subFile.isFile()) {
                    count++;
                }
            }
        }

        System.out.println(directoryNameList.toString());
        System.out.println("\n\n\n\nXXXXXXXXXXXXXXXXXXXXXXXX\n\n\n\n");
        System.out.println(fileNameList.toString());
        System.out.println("Count -> " + count);


    }
}
