package task4;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static final String PATH = "D:\\4 курс\\спецмови\\project\\lab5\\src\\main\\java\\task4\\";

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter name of the file:");
        String filename = scan.next();
        try (FileInputStream fis = new FileInputStream(PATH + filename)) {
            System.out.println("File content:\n--------------------------------");
            int i;
            while ((i = fis.read()) != -1) {
                System.out.printf("%02X ", i);
            }
            System.out.println("\n--------------------------------");
        } catch (FileNotFoundException e) {
            System.out.println("[EXCEPTION]: File '" + filename + "' not found.");
        } catch (IOException e) {
            System.out.println("[EXCEPTION]: IOException.");
        }
    }
}
