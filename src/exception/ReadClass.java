package exception;

import java.io.File;
import java.util.Scanner;

public class ReadClass {
    public static void main(String[] args) throws Exception {
        // Create file for a text file
        String filePath = "Team_1.txt";
        File file = new File(filePath);

        if(!file.exists()) {
            throw new RuntimeException("Kardes Bole bi dosya yok ne okuyacaz biz!");
        }

        Scanner input = new Scanner(file);
        while(input.hasNext()) {
            String s = input.nextLine();
            System.out.println(s);
        }
    }

}

