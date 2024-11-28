package task1;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static final String FILEPATH = "D:\\4 курс\\спецмови\\project\\lab6\\src\\main\\java\\task1\\";

    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("[a-zA-Z]+");
        try (BufferedReader reader = new BufferedReader(new FileReader(FILEPATH + "text.txt"));
             BufferedWriter writer = new BufferedWriter(new FileWriter(FILEPATH + "res.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                Matcher matcher = pattern.matcher(line);
                while (matcher.find()) {
                    writer.write(line.substring(matcher.start(), matcher.end()) + " ");
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
