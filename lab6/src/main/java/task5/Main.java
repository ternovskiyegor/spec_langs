package task5;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter you zip-file name in format - <<filename.zip>>: ");
        String name = scanner.next();
        // TODO create patern for checking name
        ZipOutputStream zout = new ZipOutputStream(new FileOutputStream("lab6/src/main/java/task5/" + name));
        String filename;
        while(true) {
            System.out.println("Enter name of the file (Write 'Q' to exit): ");
            filename = scanner.next();
            // TODO create patern for checking name
            if (filename.equals("Q")) {
                break;
            }
            zout.putNextEntry(new ZipEntry(filename));
            PrintWriter out = new PrintWriter(zout);
            scanner.nextLine();
            while (true) {
                System.out.println("Write text to add in the file (Write 'q' to exit): ");
                String content = scanner.nextLine();
                if (content.equals("q")) {
                    zout.closeEntry();
                    break;
                }
                out.println(content);
                out.flush();
            }
        }
        zout.close();
        scanner.close();
    }
}
