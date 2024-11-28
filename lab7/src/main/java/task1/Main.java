package task1;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {

    public static void main(String[] args) {
        Path userPath = Paths.get(System.getProperty("user.home"));
        System.out.println("User home dir path: " + userPath);
        for (Path p : userPath)
            System.out.println(p);

        Path currentPath = Paths.get("").toAbsolutePath();
        System.out.println("Current dir path: " + currentPath);
        for (Path p : currentPath)
            System.out.println(p);

     }
}
