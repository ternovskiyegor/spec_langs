package task6;

import task6.exceptions.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter number (1 or 2): ");
            int num = scanner.nextInt();
            if (num == 1) {
                throw new FirstException("First exception");
            } else if (num == 2) {
                throw new SecondException("Second exception");
            } else {
                System.out.println("Incorrect input!");
            }
        } catch (FirstException | SecondException e) {
            try {
                throw new ThirdException("Third exception");
            } catch (ThirdException ex) {
                e.printStackTrace();
                ex.printStackTrace();
            }
        } finally {
            scanner.close();
        }
    }
}
