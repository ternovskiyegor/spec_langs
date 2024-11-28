package task1;

public class Main {

    public static void main(String[] args) {
        GenericClass<Long> test1 = new GenericClass<>(10L, 20L, 30L);
        GenericClass<Long> test2 = new GenericClass<>(15L, 25L, 35L);

        System.out.println("Result: " + test1.compareTo(test2));
    }
}
