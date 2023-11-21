package exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Question_12_11 {
    public static void main(String[] args) {
        String filePath = "Team_1.txt";
        File file = new File(filePath);
        if (file.exists()) {
            System.out.println("File " + filePath + " is already exists!");
            throw new RuntimeException("Boyle bi dosya var uzerine yazma kardes!");
        }

        try {
            PrintWriter output = new PrintWriter(file);
            output.print("Hocalarin hocasi Sinan ->\n");
            output.print("Cello 06 ");
            output.print("Emir 06 ");
            output.print("Musa 06 ");
            output.print("Merve 06 ");
            output.println("Ada 06 ");
            output.close();
            System.out.println("Yazma islemlerinin hepsi yapildi.");

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}

