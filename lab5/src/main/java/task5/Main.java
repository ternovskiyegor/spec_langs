package task5;

import java.io.IOException;

public class Main {
    
    public static void main(String[] args) {
        try(MyCloseableClass myCloseableClass = new MyCloseableClass()) {
            myCloseableClass.test();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
