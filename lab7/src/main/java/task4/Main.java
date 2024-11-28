package task4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


public class Main {

    // java task4.Main D:\temp\file1.txt D:\temp\files\file2.txt
    public static void main(String[] args) throws IOException {
        if (args.length < 2) {
            System.out.println("Error! Use: java Main scrFilePath destFilePath");
            return;
        }

        Path src = Paths.get(args[0]);
        Path dest = Paths.get(args[1]);

        if (!Files.exists(src)) {
            throw new IOException("Source file doesn't exist!");
        }

        if (dest.endsWith("/")) {
            Files.createDirectories(dest);
            dest = dest.resolve(src.getFileName());
        } else {
            Files.createDirectories(dest.getParent());
        }
        Files.copy(src, dest);
    }
}
