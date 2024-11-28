package task2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Main {

    public static final String FILE1 = "D:\\4 курс\\спецмови\\project\\lab9\\src\\main\\resources\\words.txt";
    public static final String FILE2 = "D:\\4 курс\\спецмови\\project\\lab9\\src\\main\\resources\\words2.txt";

    public static void main(String[] args) {
        Set<String> words1 = readWordsFromFile(FILE1);
        Set<String> words2 = readWordsFromFile(FILE2);

        System.out.println("Множина 1:" + words1);
        System.out.println("Множина 2:" + words2);

        Set<String> union = new HashSet<>();
        union.addAll(words1);
        union.addAll(words2);

        System.out.println("Об'єднання множин: " + union);

        Iterator<String> iterator = words1.iterator();
        List<String> words = new ArrayList<>();
        while (iterator.hasNext()) {
            String word = iterator.next();
            if (words2.contains(word)) {
                words.add(word);
            }
        }

        System.out.println("Перетин множин: " + words);

        words = new ArrayList<>();
        iterator = words1.iterator();
        while (iterator.hasNext()) {
            String word = iterator.next();
            if (!words2.contains(word)) {
                words.add(word);
            }
        }
        iterator = words2.iterator();
        while (iterator.hasNext()) {
            String word = iterator.next();
            if (!words1.contains(word)) {
                words.add(word);
            }
        }
        System.out.println("Різниця множин:" + words);

    }

    public static Set<String> readWordsFromFile(String file) {
        Set<String> words = new HashSet<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String word;
            while ((word = reader.readLine()) != null) {
                words.add(word);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return words;
    }

}
