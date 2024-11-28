package task3;

import java.io.File;

public class Main {

    // java task3.Main D:\example ex
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Error! Correct format: java ClassName /dir /prefix");
            return;
        }
        File dir = new File(args[0]);
        System.out.println("Dir path: " + dir.getAbsolutePath());
        String prefix = args[1];

        System.out.println("Files and folders in this dir:");
        String [] content = dir.list((_, name) -> name != null && name.startsWith(prefix));

        for (String entry : content) {
            System.out.println(entry);
        }
    }
}
