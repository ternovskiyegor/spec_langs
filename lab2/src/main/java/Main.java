import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static Scanner sc = new Scanner(System.in);
    int classVariable;

    public static void main(String[] args) {
        // task1();
        // task2();
        // task4();
        // task5();
        // task6();
        // task7();
        // task8();
        // task9();
        // task10();
        // task10optimized();
    }

    public static void task1 () {
        // оголошення змінних всіх примітивних типів без ініціалізації
        int intNum;
        short shortNum;
        long longNum;
        byte byteNum;
        float floatNum;
        double doubleNum;
        char ch;
        boolean bool;

        // оголошення змінних всіх примітивних типів з ініціалізацією
        int intNum2 = 11;
        short shortNum2 = 8;
        long longNum2 = 30L;
        byte byteNum2 = (byte) (30);
        float floatNum2 = 50.0f;
        double doubleNum2 = 60.0;
        char ch2 = 'a';
        boolean bool2 = true;

        // оголошення змінних всіх примітивних типів з обчисленням при ініціалізації
        int intNum3 = 5 + 10;
        short shortNum3 = (short) (12 * 2);
        long longNum3 = 30L - 20L;
        byte byteNum3 = (byte) (30 / 2);
        float floatNum3 = 50.0f / 2;
        double doubleNum3 = 60.0 * 46.0;
        char ch3 = (char) ('a' + 1);
        boolean bool3 = (5 >= 2);

        System.out.println("Вивід змінних з ініціалізацією");
        System.out.println(intNum2);
        System.out.println(shortNum2);
        System.out.println(longNum2);
        System.out.println(byteNum2);
        System.out.println(floatNum2);
        System.out.println(doubleNum2);
        System.out.println(ch2);
        System.out.println(bool2);

        System.out.println("\nВивід змінних з обчисленням при ініціалізації");
        System.out.printf("Int num: %d (hex): %x\n", intNum3, intNum3);
        System.out.printf("Short num: %d (hex): %x\n", shortNum3, shortNum3);
        System.out.printf("Long num: %d (hex): %x\n", longNum3, longNum3);
        System.out.printf("Byte num: %d (hex): %x\n", byteNum3, byteNum3);
        System.out.printf("Float num: %.2f\n", floatNum3);
        System.out.printf("Double num: %.2f\n", doubleNum3);
        System.out.printf("Ch: %c\n", ch3);
        System.out.printf("Bool: %b\n", bool3);
    }

    public static void task2 () {
        byte byteValue = 100;
        short shortValue = byteValue;
        int intValue = shortValue;
        long longValue = intValue;

        System.out.println("byteValue: " + byteValue);
        System.out.println("shortValue: " + shortValue);
        System.out.println("intValue: " + intValue);
        System.out.println("longValue: " + longValue);

        double doubleValue2 = 123456789.987654321; // Значення, яке виходить за межі float
        float floatValue2 = (float) doubleValue2;
        System.out.println("\nDouble value: " + doubleValue2);
        System.out.println("Converted to float: " + floatValue2); // Результат буде некоректним

        int largeIntValue = 300;
        byte byteFromInt = (byte) largeIntValue;
        System.out.println("\nlargeIntValue: " + largeIntValue);
        System.out.println("byteFromInt: " + byteFromInt);
    }

    public static void task4 () {

        int[] intArray = {1, 2, 3, 4, 5};
        String[] stringArray = {"Hello", "Java", "World", "Studying"};

        System.out.println("Виведення масиву цілих чисел за допомогою циклу for:");
        for (int j : intArray) {
            System.out.print(j + " ");
        }
        System.out.println();

        System.out.println("Виведення масиву рядків за допомогою циклу for:");
        for (String s : stringArray) {
            System.out.print(s + " ");
        }
        System.out.println();

        System.out.println("Виведення масиву цілих чисел за допомогою Arrays.toString():");
        System.out.println(Arrays.toString(intArray));

        System.out.println("Виведення масиву рядків за допомогою Arrays.toString():");
        System.out.println(Arrays.toString(stringArray));
    }

    public static void task5 () {
        enum Day {
            MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
        }
        Day day = null;

        while (day == null) {
            System.out.print("Введіть ціле число (1-7): ");
            int num = sc.nextInt();
            if (num == 1) {
                day = Day.MONDAY;
            } else if (num == 2) {
                day = Day.TUESDAY;
            } else if (num == 3) {
                day = Day.WEDNESDAY;
            } else if (num == 4) {
                day = Day.THURSDAY;
            } else if (num == 5) {
                day = Day.FRIDAY;
            } else if (num == 6) {
                day = Day.SATURDAY;
            } else if (num == 7) {
                day = Day.SUNDAY;
            } else {
                System.out.println("Невірне число!");
            }
        }
        System.out.println("Ви вибрали: " + day);
    }

    public static void task6 () {
        while (true) {
            System.out.println("1) Convert inches to centimeters");
            System.out.println("2) Convert centimeters to inches");
            System.out.println("3) Exit");
            System.out.println("Enter your choice: ");
            int choice = sc.nextInt();
            if (choice == 1) {
                System.out.println("Enter amount of inches: ");
                double inches = sc.nextDouble();
                System.out.println("Result: " + Calculator.convertInchToSm(inches));
            } else if (choice == 2) {
                System.out.println("Enter amount of centimeters: ");
                double centimeters = sc.nextDouble();
                System.out.println("Result: " + Calculator.convertSmToInch(centimeters));
            } else if (choice == 3) {
                break;
            } else {
                System.out.println("Invalid choice!");
            }
        }
    }

    public static void task7 () {
        int hexNum1 = 0x3F;                   // 63
        int hexNum2 = 0xA5;                   // 165
        int hexNum3 = 0xFFFFFFE5;      // -27
        System.out.println("hexNum1 (0x3F) = " + hexNum1);
        System.out.println("hexNum2 (0xA5) = " + hexNum2);
        System.out.println("hexNum3 (0xFFFFFFE5) = " + hexNum3);

        // Знакове зрушення вліво <<
        System.out.println("\nЗнакове зрушення вліво hexNum1 << 3: " + (hexNum1 << 3));
        System.out.println("Знакове зрушення вліво hexNum2 << 3: " + (hexNum2 << 3));
        System.out.println("Знакове зрушення вліво hexNum3 << 3: " + (hexNum3 << 3));

        // Знакове зрушення вправо >>
        System.out.println("\nЗнакове зрушення вправо hexNum1 >> 2: " + (hexNum1 >> 2));
        System.out.println("Знакове зрушення вправо hexNum2 >> 2: " + (hexNum2 >> 2));
        System.out.println("Знакове зрушення вправо hexNum3 >> 2: " + (hexNum3 >> 2));

        // Беззнакове зрушення вправо >>>
        System.out.println("\nБеззнакове зрушення вправо hexNum1 >>> 2: " + (hexNum1 >>> 2));
        System.out.println("Беззнакове зрушення вправо hexNum2 >>> 2: " + (hexNum2 >>> 2));
        System.out.println("Беззнакове зрушення вправо hexNum3 >>> 2: " + (hexNum3 >>> 2));
    }

    public static void task8 () {
        final int MIN_FLOORS = 1;
        final int MAX_FLOORS = 30;

        System.out.print("Введіть кількість поверхів у будинку: ");
        int floors = sc.nextInt();

        if (floors >= MIN_FLOORS && floors <= MAX_FLOORS) {
            System.out.println("Введене значення правильне: " + floors);
        } else {
            System.out.println("Неправильне значення! Кількість поверхів має бути між " + MIN_FLOORS + " і " + MAX_FLOORS + ".");
        }
    }

    public static void task9 () {
        int product = 1;
        int number = 1;

        System.out.print("Невід'ємні непарні числа: ");
        while (product * number < 10000) {
            System.out.print(number + " ");
            product *= number;
            number += 2;
        }

        System.out.println("\nДобуток непарних чисел: " + product);
    }

    public static void task10 () {
        System.out.print("Введіть число n: ");
        int n = sc.nextInt();

        boolean[] prime = new boolean[n + 1];
        for (int i = 1; i <= n; i++) {
            prime[i] = true;
        }

        for (int p = 2; p * p <= n; p++) {
            if (prime[p]) {
                for (int i = p * p; i <= n; i += p) {
                    prime[i] = false;
                }
            }
        }

        System.out.println("Прості числа до " + n + ":");
        for (int i = 2; i <= n; i++) {
            if (prime[i]) {
                System.out.print(i + " ");
            }
        }
    }

    public static void task10optimized() {
        System.out.print("Введіть число n: ");
        int n = sc.nextInt();

        boolean[] prime = new boolean[(n / 2) + 1];

        for (int i = 1; i < prime.length; i++) {
            prime[i] = true;
        }

        for (int p = 3; p * p <= n; p += 2) {
            if (prime[p / 2]) {
                for (int i = p * p; i <= n; i += 2 * p) {
                    prime[i / 2] = false;
                }
            }
        }

        System.out.println("Прості числа до " + n + ":");
        System.out.print(2 + " ");
        for (int i = 1; i < prime.length; i++) {
            int number = 2 * i + 1;
            if (prime[i] && number <= n) {
                System.out.print(number + " ");
            }
        }
    }
}
