package task6;

import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class Main {

    public static void main(String[] args) throws IOException {
        if (args.length < 1) {
            System.out.println("Enter zip-filename!");
            return;
        }
        // java task6.Main archive.zip
        String fileName = args[0];
        ZipInputStream zin = new ZipInputStream(new FileInputStream(System.getProperty("user.dir") + "/task6/" + fileName));
        BufferedReader zs = new BufferedReader(new InputStreamReader(zin));
        ZipEntry ze;
        while ((ze = zin.getNextEntry()) != null) {
            System.out.println("File name: " + ze.getName());
            System.out.println("-----begin-of-file-------");
            String s;
            while ((s = zs.readLine()) != null) {
                System.out.println(s);
            }
            zin.closeEntry();
            System.out.println("-------end-of-file-------\n");
        }
        zs.close();
    }
}
