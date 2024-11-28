package task3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        Set<String> uniqueWords = new HashSet<>();
        try (BufferedReader reader = new BufferedReader
                (new FileReader(
                        "D:\\4 курс\\спецмови\\project\\lab9\\src\\main\\resources\\words.txt"))) {
            String word;
            while ((word = reader.readLine()) != null) {
                words.add(word);
                uniqueWords.add(word);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Words frequency:");
        for (String word : uniqueWords) {
            System.out.println( word + " : " + Collections.frequency(words, word));
        }
    }
}
