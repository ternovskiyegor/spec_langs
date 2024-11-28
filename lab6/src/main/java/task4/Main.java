package task4;

import java.io.IOException;
import java.io.RandomAccessFile;

public class Main {

    public static void main(String[] args) {
        byte [] arr = new byte[64];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (byte) ((Math.random() * 256) - 128);
            System.out.print(arr[i] + " ");
        }
        System.out.println("\n");

        try (RandomAccessFile raf = new RandomAccessFile("lab6/src/main/java/task4/file.dat", "rw")) {
            raf.write(arr);

            for (int i = 0; i < raf.length(); i += 2) {
                raf.seek(i);
                byte b = raf.readByte();
                raf.seek(i);
                raf.writeByte((byte) -b);
            }

            raf.seek(0);

            for (int i = 0; i < raf.length(); i++) {
                System.out.print(raf.readByte() + " ");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
