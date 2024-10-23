package task3;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    private static final String path = "D:\\4 курс\\спецмови\\project\\lab5\\src\\main\\java\\task3\\";

    public static void main(String[] args) throws IOException {
        /* if (args.length < 2) {
            System.out.println("To few arguments. Should be two args: sourceFile, destinationFile");
            return;
        }
        String srcFile = args[0];
        String destFile = args[1];
        */
        String srcFile = "file1.txt";
        String destFile = "file2.txt";
        try (FileInputStream fis = new FileInputStream(path + srcFile);
             FileOutputStream fos = new FileOutputStream(path + destFile)) {
            int i;
            byte [] buffer = new byte[1028];
            while ((i = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, i);
            }

            System.out.println("Coping content of " + srcFile + " to " + destFile + " successfully finished!");
        }
    }
}
