package task5;

import java.io.Closeable;
import java.io.IOException;

public class MyCloseableClass implements Closeable {

    public MyCloseableClass() {
        System.out.println("Creating class which implements Closeable interface.");
    }

    public void test() {
        System.out.println("Doing something....");
    }

    @Override
    public void close() throws IOException {
        System.out.println("Closing.");
    }
}

