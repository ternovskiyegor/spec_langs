package task2;

import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class Main {

    public static void main(String[] args) throws IOException {
        File tempFile = File.createTempFile("temp", ".txt");
        System.out.println(tempFile.getAbsolutePath());

        BufferedWriter writer = Files.newBufferedWriter(tempFile.toPath());
        writer.write("Hello world!");
        writer.flush();

        System.out.println("Enter to continue...");
        System.in.read();
        writer.close();

        System.out.println("Temp file was deleted!");
        tempFile.deleteOnExit();
    }
}
