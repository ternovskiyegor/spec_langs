package task5;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string to encrypt: ");
        String str = sc.nextLine();
        byte [] message = str.getBytes();

        XORStreamCipher xorStreamCipher = new XORStreamCipher();
        byte [] encrypted = xorStreamCipher.encrypt(message);
        System.out.println("Encrypted message: " + new String(encrypted));

        byte [] decrypted = xorStreamCipher.decrypt(encrypted);
        System.out.println("Decrypted message: " + new String(decrypted));

    }

}
