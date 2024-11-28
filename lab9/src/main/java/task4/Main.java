package task4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader
                (new FileReader(
                        "D:\\4 курс\\спецмови\\project\\lab9\\src\\main\\java\\task4\\words.txt"))) {
            String words;
            while ((words = reader.readLine()) != null) {
                list.addAll(List.of(words.split("\\s+")));
            }
            System.out.println("Before sorting:");
            System.out.println(list);
            sortList(list);
            System.out.println("\nAfter sorting:");
            System.out.println(list);
            System.out.println("\nShuffle list:");
            Collections.shuffle(list);
            System.out.println(list);
            System.out.println("\nSorting:");
            sortList(list);
            System.out.println(list);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void sortList (List<String> list) {
        list.sort(new Comparator<String>() {
            @Override
            public int compare(String word1, String word2) {
                return word1.compareTo(word2);
            }
        });
    }
}
