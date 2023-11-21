package exception;

import java.io.File;

public class GivePackageName {
    public static void main(String[] args) {
        String path = "src/students";
        File directory = new File(path);
        String directoryName = directory.getName();
        System.out.println(directoryName);
        File[] childs = directory.listFiles();

        for (File file : childs) {
            FileUtils.changeString("package students;","package military;",file);
//            try
//
//
//
//
//
// {
//                Scanner input = new Scanner(file);
//                StringBuilder stringBuilder = new StringBuilder();
//                stringBuilder.append("package " + directoryName + ";\n");
//                while (input.hasNext()) {
//                    String s = input.nextLine();
//                    stringBuilder.append(s + "/n");
//                }
//
//                PrintWriter output = new PrintWriter(file);
//                output.println(stringBuilder);
//                output.close();
//            } catch (FileNotFoundException ex) {
//                System.out.println(ex.getMessage());
//            }
        }
    }
}

