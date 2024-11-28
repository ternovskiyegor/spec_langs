package task2;

import java.util.Scanner;

public class Main {
    private static final int HASH_PASSWORD = 44490743;  // Passwd123

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your login: ");
        String login = scanner.next();
        char[] passwordArray = System.console().readPassword("Enter password: ");
        int hash = getSimpleHash(passwordArray);
        if (hash == HASH_PASSWORD) {
            System.out.println("Access granted");
        } else {
            System.out.println("Access no granted");
        }

    }

    public static int getSimpleHash(char [] password) {
        int resHash = 0;
        for (char ch : password) {
            resHash = resHash * 5 + 7 + ch;
        }
        return resHash;
    }
}
