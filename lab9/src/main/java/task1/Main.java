package task1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Main {

    static final String PATH = "D:\\4 курс\\спецмови\\project\\lab9\\src\\main\\resources\\words.txt";

    public static void main(String[] args) {
        Set<String> words = new HashSet<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(PATH))) {
            String word;
            while ((word = reader.readLine()) != null) {
                words.add(word);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Iterator print:");
        Iterator<String> iterator = words.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }

        // for-each
        System.out.println("\n\nFor-each print:");
        for (String word : words) {
            System.out.print(word + " ");
        }

        // toString()
        System.out.println("\n\nUsing toString() method:");
        System.out.println(words);
    }
}
