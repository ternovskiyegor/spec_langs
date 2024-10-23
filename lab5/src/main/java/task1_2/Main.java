package task1_2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder builder = new StringBuilder();
        String str;
        System.out.println("Write word and press ENTER (write '/exit' to stop.)");

        // getting words by the user
        while(true) {
            System.out.print("Enter string:");
            str = sc.nextLine();
            if (str.equals("/exit")) {
                break;
            }
            builder.append(str).append(" ");
            System.out.println(builder);
        }
        System.out.println("String builder contains: " + builder);

        // info about symbols in the string
        for (int i = 0; i < builder.toString().length(); i++) {
            char ch = builder.charAt(i);
            System.out.print("'" + ch + "' - ");
            if (Character.isDigit(ch)) {
                System.out.println("is digit");
            } else if (Character.isUpperCase(ch)) {
                System.out.println("is upper case letter");
            } else if (Character.isLowerCase(ch)) {
                System.out.println("is lower case letter");
            } else if (Character.isSpaceChar(ch)) {
                System.out.println("is a SPACE");
            } else if (ch == '!' || ch == '?' || ch == '.' || ch == ',' || ch == '/') {
                System.out.println("is a special symbol");
            } else {
                System.out.println("other category");
            }
        }
    }

}
